package TutorialsPoint;


public class GenericClass<T> {

	  private T t;

	  public void set(T t) {
	    this.t = t;
	  }

	  public T get() {
	    return t;
	  }

	  public static void main(String[] args) {
	     GenericClass<Integer> integerBox = new GenericClass<Integer>();
	     GenericClass<String> stringBox = new GenericClass<String>();
	    
	     integerBox.set(new Integer(10));
	     stringBox.set(new String("Hello World"));

	     System.out.printf("Integer Value : %d\n\n", integerBox.get());
	     System.out.printf("String Value : %s\n", stringBox.get());
	  }
	}

// http://www.tutorialspoint.com/java/java_generics.htm