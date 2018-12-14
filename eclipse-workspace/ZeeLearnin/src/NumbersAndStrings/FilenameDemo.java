package NumbersAndStrings;

public class FilenameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String FPATH = "C:/Users/Mac Attack/Documents/ZeeLearnin/eclipse-workspace/ZeeLearnin/src/NumbersAndStrings/FilenameDemo.java";
		Filename disFile = new Filename(FPATH, '/', '.');
		System.out.println("Extension = "+ disFile.extension());
		System.out.println("Filename = "+ disFile.filename());
		System.out.println("Path = "+ disFile.path());
	}

}
