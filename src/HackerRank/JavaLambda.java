package HackerRank;

interface PerformOperation{
	boolean check(int a);
}

class MyMath{
	
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}
	
	public static PerformOperation is_odd() {
		return  (int a) -> a % 2 != 0;
	}
	
	public static PerformOperation isPrime() {
		return (int a) -> java.math.BigInteger.valueOf(a).isProbablePrime(1);
	}
	
	public static PerformOperation is_palindrome() {
		return (int a) -> Integer.toString(a).equals(new StringBuilder(Integer.toString(a)).reverse().toString());
	}
	
}




public class JavaLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyMath mat = new MyMath();
		
		
		
		PerformOperation op;
		
		System.out.println(Integer.toString(897));
		
		System.out.println(new StringBuilder(Integer.toString(897)).reverse());
	
	}

}
