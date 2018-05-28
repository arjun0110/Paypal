package testcases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String patt="\\[a-zA-Z]{5}.\\[a-zA-Z]{5}@\\[a-zA-Z]{6}.\\[a-zA-Z]{3}";
		
		//String patt="\\w{5}.\\w{5}@\\w{6}.\\w{3}";
		//String patt="[a-zA-Z0-9_.] {2,100}@[a-zA-Z] {7}.[a-z] {3}";
		
		
		String patt="";
		//String str="arjunkumar@fiserv.com";
		String str="";
		
		Pattern p=Pattern.compile(patt);
		Matcher m=p.matcher(str);
		System.out.println(m.matches());
	}

}
