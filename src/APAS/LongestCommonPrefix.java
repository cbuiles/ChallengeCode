package APAS;

import java.util.Iterator;

/*Write a function to find the longest common prefix string amongst an array of String.
 * 
 * If there is no common prefix, return an empty string
 * 
 * */

public class LongestCommonPrefix {
	
	public static String findSmallWord(String [] words) {
		
		String smallWord = words[0];
		
		for (String string : words) {
			
			smallWord = string.length() < smallWord.length() ? string : smallWord;
			
		}
				
		return smallWord;
	}
	
	public static String isCommon (String [] words) {
		
		String smallWord = findSmallWord(words);		
		
		int countValidation = 0;
		
		for(int i = smallWord.length(); i >= 0; i --) {
			
			countValidation = 0;
			
			String word = smallWord.substring(0,i);
			
			for (String string : words) {
				
				if(string.startsWith(word)) {
					
					countValidation ++;
					
				}
				
			}
			
			if(countValidation == words.length) return smallWord.substring(0, i);
			
		}
		
		return "No match";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] words = new String[] {"flower", "flow", "floght"};
		
		System.out.println(isCommon(words));
		
//		System.out.println("flower".charAt(2));
		
		
	}

}
