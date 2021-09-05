package HackerRank;

import java.util.Scanner;

class MyCalculator1{
	
	private int n;
	
	private int p;
	
	public int power(int n, int p) throws Exception {
		
		this.n = n;
		
		this.p = p;
		
		if(n < 0 || p < 0) throw new Exception("n or p should not be negative.");
		
		if(n == 0 && p == 0) throw new Exception("n and p should not be zero.");

		
		
		return (int) Math.pow(n, p);
		
	}
}

public class JavaExceptionJHandlingII {
	
	public static final MyCalculator1 my_calculator = new MyCalculator1();
	
	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while (in.hasNext()) {
			
			int n = in.nextInt();
			
			int p = in.nextInt();
		
			
			try {
				
				System.out.println(my_calculator.power(n, p));
				
			}catch(Exception e) {
				
				System.out.println(e);
				
			}
			
		}

	}

}
