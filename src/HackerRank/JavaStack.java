package HackerRank;

import java.util.Scanner;

public class JavaStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			
			String input = sc.next();
			
			while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
			System.out.println(input.isEmpty());
			
		}

	}

}
