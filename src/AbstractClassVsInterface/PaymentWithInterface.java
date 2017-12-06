package AbstractClassVsInterface;
/**
 * http://stackoverflow.com/questions/18777989/how-should-i-have-explained-the-difference-between-an-interface-and-an-abstract
 * @author Dr.Mokter
 * http://www.javaworld.com/article/2077421/learn-java/abstract-classes-vs-interfaces.html
 
 * http://www.programmerinterview.com/index.php/java-questions/interface-vs-abstract-class/
 */
public class PaymentWithInterface
{

	static public  final void main(String args[]){  

		//PaymentWithInterface myPayment = new PaymentWithInterface();
		MyPayPal pp = new MyPayPal();
		pp.makePayment();

		MyCreditCard cc = new MyCreditCard();
		cc.makePayment();
	}
}

interface IPayment
{
	void makePayment();
	//by default it is a abstract method
	public void commonMsg();
}

class MyPayPal implements IPayment
{
	public void makePayment()
	{
		System.out.println("Payment made with Paypal");
		//some logic for paypal payment
		//like paypal uses username and password for payment
	}

	@Override
	public void commonMsg() {
		// TODO Auto-generated method stub
		// must be re-defined if even empty	
	}
}

class MyCreditCard implements IPayment
{
	public void makePayment()
	{
		System.out.println("Payment made with CreditCard");
		//some logic for CreditCard payment
		//like CreditCard uses card number, date of expiry etc...
	}

	@Override
	public void commonMsg() {
		// TODO Auto-generated method stub
		// must be re-defined if even empty
	}
}

