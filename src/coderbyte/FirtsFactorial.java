package coderbyte;

public class FirtsFactorial {

	public static int FirstFactorial(int num) {
		int factorialNumber = 1;
		for(int i = 1; i<=num; i++) {
			factorialNumber = factorialNumber * i;
		}
		
		return factorialNumber;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(FirstFactorial(4));

	}

}
