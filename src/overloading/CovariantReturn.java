package overloading;

// http://www.javatpoint.com/covariant-return-type

class A{  
A get(){return this;}  
}  
  
class B1 extends A{  
B1 get(){return this;}  

void message(){
	System.out.println("welcome to covariant return type");
	}
  
}  

public class CovariantReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B1().get().message();  

	}

}
