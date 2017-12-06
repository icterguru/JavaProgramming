package TutorialsPoint;

public class Recursion{
	
	public  int Fibonacci(int n){
		if (n<=0)
			return 1;
		else if (n==1) return 1;
		else
			return (Fibonacci (n-1) + Fibonacci (n-2));
		
	}
	
	public  int Factorial (int n){
		if (n<=0)
			return 1;
		else 
			return n* Factorial(n-1);
		
	}
	
	public static void main(String arg[]){
		
		Recursion r = new Recursion();
		
		System.out.println("Fibonacci  0 is:  " + r.Fibonacci(0));
		System.out.println("Fibonacci  1 is:  " + r.Fibonacci(1));
		System.out.println("Fibonacci  2 is:  " + r.Fibonacci(2));
		System.out.println("Fibonacci  3 is:  " + r.Fibonacci(3));
		System.out.println("Fibonacci  4 is:  " + r.Fibonacci(4));
		System.out.println("Fibonacci  5 is:  " + r.Fibonacci(5));
		
		System.out.println();
		
		System.out.println("Factorial 0 is:  " + r.Factorial(0));
		System.out.println("Factorial 1 is:  " + r.Factorial(1));
		System.out.println("Factorial 2 is:  " + r.Factorial(2));
		System.out.println("Factorial 3 is:  " + r.Factorial(3));
		System.out.println("Factorial 4 is:  " + r.Factorial(4));
		System.out.println("Factorial 5 is:  " + r.Factorial(5));

	}
}