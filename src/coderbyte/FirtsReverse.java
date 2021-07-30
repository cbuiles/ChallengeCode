package coderbyte;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirtsReverse {
	
	public static String FirstReverse(String str) {
		List<String> list = Arrays.asList(str.split(""));
		Collections.reverse(list);
		str = "";
		for (String word : list) str = str + word;
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FirstReverse("coderbyte"));

	}

}
