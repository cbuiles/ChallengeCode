package APAS;

import java.util.HashMap;
import java.util.Map;

public class RomanNums {
	
	public static int romanNums (String num) {
		
		Map <String, Integer> romanNums = new HashMap<String, Integer>();
		
		romanNums.put("I", 1);
		romanNums.put("V",5);
		romanNums.put("X", 10);
		romanNums.put("L", 50);
		romanNums.put("C", 100);
		romanNums.put("D", 500);
		romanNums.put("M", 1000);
		
		int arabNum = 0;
		
		for (String letter : num.split("")) {
						
			arabNum += romanNums.get(letter);
			
		}
		
		return arabNum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(romanNums("MCMXCIV"));
		
	}

}
