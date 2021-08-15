package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaList {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		ArrayList<String> numbers = new ArrayList<String>();
		
//		Rellenando el Array con los datos ingresados
		
		for (int i = 0 ; i < n ; i ++) {
			
			numbers.add(scan.next());
			
		}
		
		int queries = scan.nextInt();

		
		for (int i = 0; i < queries ; i ++) {
			
			String action = scan.next();
			int index = scan.nextInt();
			
			if(action.equals("Insert")) {
//				Agregar el dato en una posicion especifica
				numbers.add(index,scan.next());
			}else if(action.equals("Delete")) {
				numbers.remove(index);
			}
			
		}
		
//		Forma de convertir un arrayList en un String
		System.out.println(String.join(" ", numbers));
		
				
		
	}

}
