package HackerRank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaEndOfFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String str;
		
		int contador = 1;
		
		while (sc.hasNext()) {
			
			str = sc.nextLine();
			
			System.out.println(contador + " " + str);
			
			contador ++;
			
		}
		

	}

}
