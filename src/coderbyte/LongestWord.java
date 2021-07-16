package coderbyte;

import java.util.regex.*;

public class LongestWord {

	public static String LongestWord(String sen) {	
		String longestWord = "";		
		System.out.println(longestWord.length());
		String reg = "(?i)[a-z]+$";
		Pattern pat = Pattern.compile(reg);			
		String[] arrayWords = sen.split(" ");
		for (String string : arrayWords) {
			Matcher mat = pat.matcher(string);
			if(mat.matches() && longestWord.length()<string.length()) {
				longestWord = string;
			}
		}
		return longestWord;				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(LongestWord("i love dogs"));
		
	}

}
