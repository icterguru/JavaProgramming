package TutorialsPoint;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	private String fname;
	private String lname;
	/**
	 * @param fname
	 * @param lname
	 */
	public Student(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "This student's First Name: " + fname + ", and Last Name: " + lname;
	}	

}

public class FileIO_Serializable
{
	public static void main(String args[]) throws IOException
	{
		Student Mahdi = new Student("Mosaddek", "Mahdi");

		writeToFile(Mahdi);

		System.out.println("Done. .  .");	

	}

	public static void writeToFile  (Student s) throws IOException{
		ObjectOutputStream  oos = new ObjectOutputStream (new FileOutputStream("student.txt"));	
		oos.writeObject(s);
		oos.close();
	}

	public static void readFromFile() throws IOException, ClassNotFoundException{
		ObjectInputStream  ois = new ObjectInputStream (new FileInputStream ("student.txt"));
		Student s = (Student) ois.readObject();
		System.out.println(s);
	}

}