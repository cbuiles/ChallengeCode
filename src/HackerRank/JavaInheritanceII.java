package HackerRank;

class Arithmetic {
	
	int add(int integer1, int integer2) {
		
		return integer1 + integer2;
		
	}
}

class Adder extends Arithmetic {
	
}

public class JavaInheritanceII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder a = new Adder();
		
		System.out.println("My superclass is: " + a.getClass().getSuperclass().getName() );
		
		System.out.println(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
	}

}
