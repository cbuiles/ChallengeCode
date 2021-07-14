package coderbyte;

public class LongestWord {

	public static String LongestWord(String sen) {
		
		String[] arrayWords = sen.split(" ");
		for (String string : arrayWords) {
			System.out.println(string);
			
		}
		return sen;				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(LongestWord("HOla mundo"));
		
	}

}
