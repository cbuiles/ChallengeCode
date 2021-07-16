package coderbyte;

import java.util.Iterator;

public class FindIntersection {

	public static String FindIntersection(String[] strArr) {			
		String intersection = "";		
		for (String number1 : strArr[0].split(",")) {
			
			for (String number2 : strArr[1].split(",")) {
				if (number1.trim().equals(number2.trim()))intersection = intersection.equals("")? number1.trim(): intersection+ "," + number1.trim();
			}
		}
		return intersection.equals("")?"false": intersection;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(FindIntersection(new String[] {"1, 5, 6, 7, 10, 11, 12", "5, 6, 8, 11, 17"}));
	}	
}
