package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class JavaSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int n = scan.nextInt();
		
		int[] a = new int[n];
		
		int aux = 0;
		
		for(int i = 0; i < n ; i ++)a[i] = scan.nextInt();
		
		for(int j = 0; j < n ; j ++) {
			
			for (int k = 1; k <= n; k ++) {
				
				if(k > j ) {
					if(Arrays.stream(Arrays.copyOfRange(a, j, k)).sum() < 0) aux ++;
					
				}
				
			}
			
		}
		
		System.out.println(aux);
		
		
		
		
		
//		System.out.println(Arrays.stream(a).sum());
	
		
		
	}

}
