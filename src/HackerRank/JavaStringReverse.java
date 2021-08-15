package HackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		
		String reverseString = "";
		
		char[] ch = A.toCharArray();
		
		for(int i = ch.length - 1; i >= 0 ; i--) reverseString += ch[i]; 
		
		System.out.println(A.equals(reverseString)? "Yes" : "No");
		
//		Best answer
		
		System.out.println(A.equals(new StringBuilder(A).reverse().toString())?"Yes": "No");
	}

}
