package fileIOpackage;
import java.io.*;

public class FileStreamTester {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Reader inFile = null;
		Writer outFile = null;
		
		try {
			inFile = new BufferedReader(new FileReader("ReadFrom.txt"));
			outFile = new BufferedWriter(new FileWriter("WriteTo.txt"));
			
			int i = inFile.read();
			while(i != -1) {
				outFile.write(i);
				i = inFile.read();
			}
		}catch (IOException io) {
			io.printStackTrace();
		}finally {
			if(inFile != null) inFile.close();
			if(outFile != null) outFile.close();
		}
	}

}
