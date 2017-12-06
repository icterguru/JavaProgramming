package overloading;

public class MainMethodOverloading {
	public static void main(int a){  
		System.out.println(a);  
	}  

	public static void main(double a){  
		System.out.println(a);  
	}  

	public static void main(String args[]){  
		System.out.println("main() method invoked");  
		main(10);  
		main(10.0);  
		main("Overloaded main() with String args..");
		
	}  

	public static void main(String a){  
		System.out.println(a);  
	}  


}  

