package NumbersAndStrings;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palindrome = "Dot saw I was Tod";
		
		StringBuilder sb = new StringBuilder(palindrome);
		
		sb.reverse();
		
		System.out.println(sb);
	}

}
