package TutorialsPoint;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// http://www.tutorialspoint.com/java/java_serialization.htm

class Employee implements java.io.Serializable
{
   public String name;
   public String address;
   public transient int SSN;
   public int number;
   public void mailCheck()
   {
      System.out.println("Mailing a check to " + name
                           + " " + address);
   }
}

public class FileIO_SerializeDemo {
	   public static void main(String [] args)
	   {
	      Employee e = new Employee();
	      e.name = "Mahdi Munim";
	      e.address = "Dallas, TX, USA";
	      e.SSN = 11122333;
	      e.number = 101;
	      try
	      {
	         FileOutputStream fileOut =
	         new FileOutputStream("employee.txt");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in employee.txt");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
	   
	   System.out.println("\n\nDone.....");
	   }
	}