import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	public static boolean validateEmailOld(String email) {
		Pattern regex = Pattern.compile("\\w+[.]?\\w+@{1,1}([a-zA-Z]+[.]{1}[a-zA-Z]+)+");
		Matcher emailMatcher = regex.matcher(email.trim());
		return emailMatcher.matches();
	}

	public static void main(String[] args){
		
		
		
	}
	
	
}
