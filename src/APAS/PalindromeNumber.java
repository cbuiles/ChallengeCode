package APAS;

public class PalindromeNumber {
	
	public static boolean palindromeNumberString(int num) {
		
		String reverseNum = new StringBuilder(Integer.toString(num)).reverse().toString();
		
		if(num == Integer.valueOf(reverseNum)) {
			return true;
		}else {
			return false;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Example 1");
		System.out.println(palindromeNumberString(121));		
		
		System.out.println("Example 2");
		System.out.println(palindromeNumberString(231));
		
		System.out.println("Example 3");
		System.out.println(palindromeNumberString(10));
	}

	
}
