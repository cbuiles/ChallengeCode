package HackerRank;

import java.util.Scanner;

public class JavaSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int start  = sc.nextInt();
		
		int end = sc.nextInt();
		
		System.out.println(s.substring(start,end));

	}

}
