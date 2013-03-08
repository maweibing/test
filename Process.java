import java.io.*;
public class Process{
	private static FileInputStream input;
	private FileOutputStream output;

	public static void main(String[] args) throws IOException{
		try{
			input = new FileInputStream(new File("JavaClass.java"));
			byte[] buf = new byte[1024];
			int hasread = 0;
			while((hasread = input.read(buf)) >0){
				System.out.println(new String(buf, 0, hasread));
				System.out.println(hasread);
			}
		}catch(IOException ex){
			ex.printStackTrace();
		}
		finally{
			if(input != null){
				input.close();
			}
		}
	}
}