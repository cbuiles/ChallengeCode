package HackerRank;

import java.util.Scanner;

interface AdvancedArithmetic {
	
	int divisor_sum(int number);
	
}

class MyCalculator implements AdvancedArithmetic{
	
	@Override
	public int divisor_sum(int number) {
		
		int sum_div = 0;
		
		for(int i = 1; i <= number ; i++ ) {
			
			sum_div = number % i == 0 ? sum_div + i : sum_div;
			
		}
		
		return sum_div;
	}
	
}

public class JavaInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
		

	}
	
	static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }

}
