package coderbyte;

import java.util.*;
import java.io.*;
import java.util.regex.*;


public class UsernameValidation {
	
	public static String CodelandUsernameValidation(String str) {
		String reg = "(?i)^[a-z]{1}[a-z0-9_]{2,25}[^_]$";
		Pattern pat = Pattern.compile(reg);
		Matcher mat = pat.matcher(str);
		if(mat.matches()) {
			str = "true";
		}else {
			str = "false";
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CodelandUsernameValidation("Holt"));
		
	}

}
