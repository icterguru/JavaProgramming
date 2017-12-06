package Abstraction;


abstract class Animal
{
   public void eat()
   {
        // do something with food.... 
   }

   public void sleep(int hours)
   {
        try
	{
		// 1000 milliseconds * 60 seconds * 60 minutes * hours
		Thread.sleep ( 1000 * 60 * 60 * hours);
	}
	catch (InterruptedException ie) { /* ignore */ } 
   }

   public abstract void makeNoise();
}

class Dog extends Animal
{
   public void makeNoise() { System.out.println ("Dog Barks, Bark! Bark!"); }
}

class Cow extends Animal
{
   public void makeNoise() { System.out.println ("Cow Moos, Moo! Moo!"); }
}

public class AnimalAbstraction extends Cow{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnimalAbstraction aa = new AnimalAbstraction();
		aa.makeNoise();

		
	}

}

