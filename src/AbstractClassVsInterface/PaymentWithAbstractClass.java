package AbstractClassVsInterface;

/**
 * http://stackoverflow.com/questions/18777989/how-should-i-have-explained-the-difference-between-an-interface-and-an-abstract
 * @author Dr.Mokter
 *  http://www.javaworld.com/article/2077421/learn-java/abstract-classes-vs-interfaces.html
 
 * http://www.programmerinterview.com/index.php/java-questions/interface-vs-abstract-class/
 * 
 */
public class PaymentWithAbstractClass {

		static public  final void main(String args[]){  
			
		//PaymentWithInterface myPayment = new PaymentWithInterface();
			PayPal pp = new PayPal();
			
			pp.makePayment();
			pp.commonMsg();
			CreditCard cc = new CreditCard();
			cc.makePayment();
			cc.commonMsg();
		}
	}
		
	abstract class acPayment
	{
		int i;
		
		public void commonMsg(){
			System.out.println("This is in the abstract class's method");
		} // default body
	
		
		abstract  void makePayment();
	    //by default it is a abstract method
	}

	class PayPal extends acPayment
	{
	    
		public void makePayment()
	    {
			
			System.out.println("Payment made with Paypal");
	    	//some logic for paypal payment
	        //like paypal uses username and password for payment
	    }
		public void commonMsg(){
			System.out.println("This is in the PayPal class....");
		} // re-definition
	
	
	}

	class CreditCard extends acPayment
	{
	    public void makePayment()
	    {
	    	System.out.println("Payment made with CreditCard");
	        //some logic for CreditCard payment
	        //like CreditCard uses card number, date of expiry etc...
	    }
	    
	    public void commonMsg(){
			System.out.println("This is in the CreditCard class...");
		} // re-definition
	
	}

