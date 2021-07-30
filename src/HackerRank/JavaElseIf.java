package HackerRank;

import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaElseIf {
	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		 Scanner sc=new Scanner(System.in);
         System.out.println("================================");
         for(int i=0;i<3;i++){
             String s1=sc.next();
             int x=sc.nextInt();
             
             String number = x < 100 && x > 9? String.format("%01d", x):String.format("%02d", x);
             
             String numberSpace = Integer.toString(15 - s1.length());
             
             System.out.println(String.format("%-" + numberSpace + "s", s1) + number);
            
             
         }
         System.out.println("================================");
         
		
	}

}
