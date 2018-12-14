package regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsOld {
	
	public static boolean validateMobileNumber(String mobileNumber) {
		Pattern regex = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
		Matcher mobileMatcher = regex.matcher(mobileNumber);
		return mobileMatcher.matches();
	}
	
	public static boolean validateName(String name) {
		Pattern regex = Pattern.compile("([a-zA-Z]+\\s?)+");
		Matcher nameMatcher = regex.matcher(name.trim());
		return nameMatcher.matches();
	}
	
	public static boolean validateEmail(String email) {
		Pattern regex = Pattern.compile("\\w+[.]?\\w+@{1,1}([a-zA-Z]+[.]{1}[a-zA-Z]+)+");
		Matcher emailMatcher = regex.matcher(email.trim());
		return emailMatcher.matches();
	}
	
	
	public static void checker(String casetype, String value) {
		switch(casetype) {
		case "email": 
			if(validateEmail(value)) {
				System.out.println(value+" is a valid Email | "+validateEmail(value) );
			}
			else {
				System.out.println(value +" is NOT a valid Email | "+validateEmail(value));
			}
			break;
		case "name":
			if(validateName(value)) {
				System.out.println(value+" is a valid name");
			}
			else {
				System.out.println(value+" is NOT a valid name");
			}
			break;
		case "number":
			if(validateMobileNumber(value)) {
				System.out.println(value+" is a valid mobile number");
			}else {
				System.out.println(value+" is NOT a valid mobile number");
			}
			break;
			default: 
				System.out.println("Casetype is incorrect, number, email, or name");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		checker("email","heavymetalking_08@hotmail.com");
		checker("number","573-631-6423");
		checker("name","Mary Ann");
		checker("email","devin.king@infosys.com");
		checker("email","devin.king@@infosys.com");
		checker("email","d3vin.kang@infosys..com");
		checker("email", "d3v.kng@gmail.co.nz.edu");
		checker("email", "devin..king@infosys.com");
		checker("email", "devin_.3ing@infosys.cam");
	}

}
