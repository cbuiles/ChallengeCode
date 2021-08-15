package HackerRank;

import java.util.Scanner;

public class InictializerBlock {
	
	static int B;
	static int H;
	static boolean flag = true;
	
	static {
		
		Scanner sc = new Scanner (System.in);
		
		B = sc.nextInt();		
		H = sc.nextInt();
		
		try {
			
			if(B <= 0 || H <= 0 ) throw new Exception("Breadth and height must be positive");
		}catch(Exception e) {
			flag = false;
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		if(flag) {
			int area = B*H;
			
			System.out.println(area);
		}

	}

}
