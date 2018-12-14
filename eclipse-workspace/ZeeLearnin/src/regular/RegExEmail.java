package regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExEmail {
	
	private String email = null;
	private String emailName = null;
	private String emailDomain = null;

	public RegExEmail(String email) {
		super();
		this.email = email;
	}

	public static boolean validateEmailOld(String email) {
		Pattern regex = Pattern.compile("\\w+[.]?\\w+@{1,1}([a-zA-Z]+[.]{1}[a-zA-Z]+)+");
		Matcher emailMatcher = regex.matcher(email.trim());
		return emailMatcher.matches();
	}
	
	public void splitEmail(String email) {
		
		String t = email.trim();
		char at = '@';
		int atI = t.indexOf(at);
		int lastAtI = t.lastIndexOf(at);
		if(atI != lastAtI) {
			// There's 2+ '@'s 
			System.out.println("Error: There are 2 or more @ in email!");
		}
		else if(atI == -1) {
			// There are no '@'s
			System.out.println("Error: No @ in email!");
		}
		else {
		emailName = t.substring(0, atI);
		emailDomain = t.substring(atI + 1);
		System.out.println(email+" | emailname:"+emailName+" | emaildomain:"+emailDomain);
		}
	}

	public static void main(String[] args){
		RegExEmail t1 = new RegExEmail("heavymetalking_08@hotmail.com");
		RegExEmail t2 = new RegExEmail("heavy.metalking_08@hot_mail.com");
		RegExEmail t3 = new RegExEmail("heavymetalking_08@hot.mail.com");
		
		t1.splitEmail(t1.email);
		t2.splitEmail(t2.email);
		t3.splitEmail(t3.email);

		System.out.println(t1.getEmailName()+"|"+t1.getEmailDomain());
		
		RegularExpressionsOld.checker("email", t1.email);
		RegularExpressionsOld.checker("email", t2.email);
		RegularExpressionsOld.checker("email", t3.email);
		
		System.out.println("hashcode:"+t1.hashCode());
		System.out.println("email hashcode:"+ t1.email.hashCode() );
		System.out.println("Convert email hashcode to string then get bytes:"+ Integer.toString(t1.email.hashCode()).getBytes());
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailName() {
		return emailName;
	}

	public void setEmailName(String emailName) {
		this.emailName = emailName;
	}

	public String getEmailDomain() {
		return emailDomain;
	}

	public void setEmailDomain(String emailDomain) {
		this.emailDomain = emailDomain;
	}
	
	
}
