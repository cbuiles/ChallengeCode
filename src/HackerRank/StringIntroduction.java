package HackerRank;

import java.util.Scanner;

public class StringIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		
		String B = sc.next();
		
//		Imprimir la suma de los dos String
		
		System.out.println(A.length() + B.length());
		
//		Comprobar cual palabra esta primera en el alfabeto
		
		System.out.println(A.compareTo(B)> 0 ?  "No": "Yes" );
		
//		Capitaliza String
		
		A = A.substring(0,1).toUpperCase() + A.substring(1);
		
		B = B.substring(0,1).toUpperCase() + B.substring(1);
		
		System.out.println(A + " " +  B);
		

	}

}
