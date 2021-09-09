package APAS;

public class ReverseInteger {
	
	public static StringBuilder reverseInteger(int num) {		
		
		return new StringBuilder(Integer.toString(num)).reverse();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reverseInteger(120));

	}

}
