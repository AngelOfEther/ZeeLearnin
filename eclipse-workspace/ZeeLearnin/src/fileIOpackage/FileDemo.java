package fileIOpackage;
import java.io.File;
import java.io.IOException;
public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\Mac Attack\\eclipse-workspace\\ZeeLearnin\\FileDemo.txt");
		boolean isCreated = file.createNewFile();
		System.out.println("File created: "+isCreated);
		System.out.println("Name of the file: "+file.getName());
		System.out.println("Path of the file: "+file.getPath());
		System.out.println("Is a Directory? : "+file.isDirectory());
		System.out.println("list: "+file.list());
	}

}
