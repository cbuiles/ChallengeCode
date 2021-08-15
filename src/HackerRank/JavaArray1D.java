package HackerRank;

import java.util.Scanner;

public class JavaArray1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan  = new Scanner (System.in);
		int n = scan.nextInt();
		
		int[] a = new int [n];
		
		for(int i = 0; i < n ; i ++ ) {
			int k = scan.nextInt();
			
			a[i] = k;
			
		}
		

	}

}
