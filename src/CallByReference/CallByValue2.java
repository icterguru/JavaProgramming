package CallByReference;

// http://www.javatpoint.com/call-by-value-and-call-by-reference-in-java

class Operation2{  
	 int data=50;  
	  
	 void change(Operation2 op){  
	 op.data += 100; 
	//data=data+100;
	 //changes will be in the local variable only  
	 }  

}	 
public class CallByValue2 {


	 public static void main(String args[]){  
	   Operation2 op=new Operation2();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(op);  
	   System.out.println("after change "+op.data);  
	  
	 }
}