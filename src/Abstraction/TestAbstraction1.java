  
package Abstraction;
 /// http://www.javatpoint.com/abstract-class-in-java

//In real scenario, method is called by programmer or user  
public class TestAbstraction1{  
	static public  final void main(String args[]){  

		Shape c=new Circle();
		//In real scenario, object is provided through method e.g. getShape() method  
		c.draw();  

		Shape r=new Rectangle();
		//In real scenario, object is provided through method e.g. getShape() method  
		r.draw();  

	}  
}

abstract class Shape{  
	abstract void draw();  
}  
//In real scenario, implementation is provided by others i.e. unknown by end user  
class Rectangle extends Shape{  
	void draw(){
		System.out.println("drawing rectangle");
	}  
}  

class Circle extends Shape{  
	void draw(){System.out.println("drawing circle");
	}  
}  
