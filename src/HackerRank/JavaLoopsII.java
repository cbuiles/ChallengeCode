package HackerRank;

import java.util.Scanner;

public class JavaLoopsII {

	public static void main(String[] args) {
				
		Scanner in = new Scanner (System.in);
		int t = in.nextInt();
		
		
		for (int i = 0; i < t ; i ++) {
			
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			
			int aux = a;
			int count = 1;				
			for (int j = 0 ; j < n ;  j ++) {
				aux = aux + count * b;
				System.out.print(aux +  " ");
				
				count = (count) *2;
			}
			
			System.out.println("");
						
		}
		in.close();		
		
	}

}
