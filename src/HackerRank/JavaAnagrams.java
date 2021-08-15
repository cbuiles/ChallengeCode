package HackerRank;

import java.util.Scanner;

public class JavaAnagrams {

	public static boolean isAnagram(String a, String b) {
		
		java.util.HashMap<String, Integer> map1 = new java.util.HashMap<>();
		java.util.HashMap<String, Integer> map2 = new java.util.HashMap<>();
		
		for (String string : a.toLowerCase().split("")) map1.put(string, 0);
		for (String string : b.toLowerCase().split("")) map2.put(string, 0);
		
		map1.forEach((k, v) -> {
			for (String letter : a.toLowerCase().split("")) {
				if(k.equals(letter)) map1.put(k, map1.get(k) + 1);
			}
		});
		
		map2.forEach((k, v) -> {
			for (String letter : b.toLowerCase().split("")) {
				if(k.equals(letter)) map2.put(k, map2.get(k) + 1);
			}
		});
	 		
		
		return map1.equals(map2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		
		scan.close();
		
		boolean ret = isAnagram(a,b);
		
		System.out.println(ret ? "Anagrams" : "Not Anagrams");
	}

}
