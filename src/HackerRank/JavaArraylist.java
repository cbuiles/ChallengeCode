package HackerRank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		ArrayList <String[]> arrayOfArrayList = new ArrayList<String[]>();
		
		for(int i = 0; i < n ; i++) {
			
			int arraySize = scan.nextInt();			
			
			arrayOfArrayList.add(arraySize == 0 ? null : scan.nextLine().trim().split(" "));			
		}
		
		
//		Get Position
		
		int iteration = scan.nextInt();
		
		for(int i = 0; i < iteration ; i ++ ) {
			
			int x = scan.nextInt() -1;
			
			int y = scan.nextInt() -1;
			
			try {
				
				if(arrayOfArrayList.size() >= x && arrayOfArrayList.get(x) != null ) {
					
					String[]  arrayPosition = arrayOfArrayList.get(x);
					
					System.out.println(arrayPosition.length >= y ? arrayPosition[y]: "ERROR!");
					
				}else {
					System.out.println("ERROR!");
				}
				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}
			
		}

	}

}
