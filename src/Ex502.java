
public class Ex502 {
	public static double add(double a, double b) {return a + b;}
	
	public static double sub(double a, double b) {return a - b;}
	
	public static double mult(double a, double b) {return a * b;}

	public static double div(double a, double b) {return a / b;}
	
	public static double max(double a, double b) 
	{if (a >= b )
		return a;
	else return b;}
	
	//Factorial
	public static void factorial(int a) {
		double result = 1;
		for (int i = 1; i <= a; i++) {
			result *= i;
		}
		System.out.println("Factorial of " + a + "!" + result);
	}
	
	//Circle
	public static void circ(int a) {
		System.out.println("Pizza size: " + 2 * a * 3.1415792 + " inches: ");
		
			
	 
	}
	
	public static void area(int a) { 
		System.out.println("Pizza size: " + a * a * 3.1415792 + " inches: ");
		
	}
	
	public static double min(double a, double b) 
	{if (a >= b )
		return a;
	else return b;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 15;
		int b = 7;
		
		factorial(a);
		factorial(b);
		
		System.out.println("Calculator program: ");
		System.out.println("ADD: " + a + "+" +b + "=" + add(a,b));
		System.out.println("Subtract: " + a + "+" +b + "=" + sub(a,b));
		System.out.println("Multiply: " + a + "+" +b + "=" + mult(a,b));
		System.out.println("Divide: " + a + "+" +b + "=" + div(a,b));
		
		System.out.println("Max(" + a + "," + b + "): "+ max(a,b));
		System.out.println("Min(" + a + "," + b + "): "+ min(a,b));

		//Circle (pizza) 계산
		circ(a);
		area(a);
	}

}
