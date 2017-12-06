package CallByReference;

class Operation1{  
	 int data=50;  
	  
	 void change(int data){  
	 data=data+100;//changes will be in the local variable only  
	 }  

}	 
public class CallByValue1 {


	 public static void main(String args[]){  
	   Operation1 op=new Operation1();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(500);  
	   System.out.println("after change "+op.data);  
	  
	 }
}

