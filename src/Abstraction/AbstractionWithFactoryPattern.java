package Abstraction;


/// http://www.javatpoint.com/abstract-class-in-java

//In real scenario, method is called by programmer or user  
public class AbstractionWithFactoryPattern {
	static public  final void main(String args[]){  

		MyShape c=new MyCircle();
		//In real scenario, object is provided through method e.g. getShape() method  
		c.draw();  

		MyShape r=new MyRectangle();
		//In real scenario, object is provided through method e.g. getShape() method  
		r.draw();  

	}  
}

abstract class MyShape{  
	abstract void draw();  
}  
//In real scenario, implementation is provided by others i.e. unknown by end user  
class MyRectangle extends MyShape{  
	void draw(){
		System.out.println("drawing a rectangle");
	}  
}  

class MyCircle extends MyShape{  
	void draw(){System.out.println("drawing a circle");
	}  
}  
