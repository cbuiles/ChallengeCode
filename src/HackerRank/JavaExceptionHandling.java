package HackerRank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {

			Scanner sc = new Scanner(System.in);
			
			int x = sc.nextInt();
			
			int y = sc.nextInt();
			
			System.out.println(x / y);
			
		} catch (Exception e) {
			
			  if (e instanceof ArithmeticException) {
			        System.out.println("java.lang.ArithmeticException: / by zero");
			      } else if (e instanceof InputMismatchException){
			        System.out.println("java.util.InputMismatchException");
			      }
			
		}
		
		
		

	}

}
