package fileIOpackage;
import java.io.*;
public class FileIO2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//createBufferedWriter();
		//createBufferedReader();
		tryWithResources("DevinStuff.txt");
	}
	
	public static void createBufferedWriter() throws IOException {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Kannada.txt")));
			bw.write("\u0c87\u0ca8\u0ccd\u0cab\u0cc6\u0cc2\u0cd5\u0cb8\u0cbf\u0cb8\u0ccd");
			System.out.println("Data written successfully");
		}catch (IOException ioe) {
			System.out.println("ERROR: "+ ioe.getMessage());
		}finally {
			if(bw !=null) bw.close();
		}
	}
	
	public static void createBufferedReader() throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("Kannada.txt")));
			System.out.println("Data in the file is: ");
			int data = br.read();
			while(data != -1) {
				System.out.print((char)data);
				data = br.read();
			}
		}catch (IOException ioe) {
			System.err.println("ERROR: "+ioe.getMessage());
		}finally {
			if(br != null) br.close();
		}
	}
	
	public static void tryWithResources(String filename) throws FileNotFoundException, IOException {
		try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename)));
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)))	){
			
			bw.write("Devin,Paul,King,28,MO,GA");
			System.out.println("Data written successfully");
			
			int data = br.read();
			while(data != -1) {
				System.out.print((char)data);
				data = br.read();
			}
			
		}catch (IOException ioe) {
			System.err.println("ERROR: "+ioe.getMessage());
		}finally {
			
		}
	}

}
