package HackerRank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		while(testCases > 0 ) {
			
			try {
				
				String pattern = in.nextLine();
				
				Pattern.compile(pattern);
				
				System.out.println("Valid");
				
			}catch(PatternSyntaxException p) {
				System.out.println("Invalid");
			}
			
			testCases --;
			
		}

	}

}
