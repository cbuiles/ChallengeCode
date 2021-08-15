package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger n = sc.nextBigInteger();
		
		sc.close();
		
		System.out.println(n.isProbablePrime(100)? "prime" : "not prime");

	}

}
