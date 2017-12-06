package TutorialsPoint;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class FileIO_BufferedReader1 {

	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new FileReader ("/Users/Dr.Mokter/EclipseMacProjects/JavaCodes/src/people.txt"));
		ArrayList<Person> peopleList = new ArrayList<Person>();
		
		String line = null;
		

	while ((line = br.readLine()) != null)
	{
		String[] peopleInfo = line.split(",");
		
		String firstName = peopleInfo[0];
		String lastName = peopleInfo[1];
		
		peopleList.add(new Person (firstName, lastName));
		
	}
	
	for (Person p: peopleList){
	System.out.println(p);	
	}

	System.out.println("Done...");
	
	}
	

}
