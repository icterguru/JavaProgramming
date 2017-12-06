package Inheritance;

class A{  
	void msg(){
		System.out.println("Hello");
	}  
}  
class B extends A{  
	void msg(){
		System.out.println("Welcome");
	}  
}  

public class C extends B
{
	//suppose if it were  

	public static void main(String args[]){  
		C obj=new C();  
		
		obj.msg();//Now which msg() method would be invoked?  
	}  
}  