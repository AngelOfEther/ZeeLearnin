package fileIOpackage;
import java.io.*;
public class RandomAccessDemo {
 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		RandomAccessFile randomFile = new RandomAccessFile("C:\\Users\\Mac Attack\\eclipse-workspace\\ZeeLearnin\\Output.txt", "rw");
		randomFile.writeUTF("Writing");
		System.out.println("Current position: "+randomFile.getFilePointer());
		randomFile.seek(0);
		System.out.println(randomFile.readUTF());
		System.out.println("Current position: "+randomFile.getFilePointer());
		randomFile.close();

	}

}
