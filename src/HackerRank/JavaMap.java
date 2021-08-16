package HackerRank;

import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
		
		int n = in.nextInt();
		in.nextLine();
		
		for(int i = 0 ;  i < n ; i++) {
			
			String name = in.nextLine();
			int phone = in.nextInt();
			
//			Add Keys and values (Name, Phone)
			
			in.nextLine();
			phoneBook.put(name, phone);
			
			
		}
		
		while(in.hasNext()) {
			
			String query = in.nextLine();
			
			if(phoneBook.get(query) != null) {
				System.out.println(query+ "=" + phoneBook.get(query));
			}else {
				System.out.println("Not found");
			}
			
		}
		
	}

}
