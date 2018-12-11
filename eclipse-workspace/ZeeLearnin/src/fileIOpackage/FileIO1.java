package fileIOpackage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			createFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void createFile() throws IOException {

		FileOutputStream outFile = new FileOutputStream("CandidateNames.txt");
		
		String data = "Ahalya Bhairav Chitra Dushyant Eshwari Falgun Gargi Hiren";
		byte byteArray[] = data.getBytes();
		
		outFile.write(byteArray);
		outFile.close();
	}
	
	public static void readFile() throws IOException {
		FileInputStream inFile = new FileInputStream("CandidateNames.txt");
		
		int i = inFile.read();
		
		while(i != -1) {
			System.out.print((char)i);
			i = inFile.read();
		}
		
		inFile.close();
	}

}
