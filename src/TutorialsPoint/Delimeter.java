package TutorialsPoint;

import java.util.ArrayList;
import java.util.Scanner;

public class Delimeter {

	public static void main (String agrs[])
	{

		String names = "Mosaddek,Hossain,Mahdi,Muhaimin,Hossain,Munim";

		Scanner scan = new Scanner(names);

		ArrayList<String> nameList = new ArrayList <String> ();


		scan.useDelimiter(",");

		// see also split()??
		
		while(scan.hasNext())
		{
			nameList.add(scan.next());
		}

		for(String n: nameList)
		{
			System.out.println(n);
		}

	}

}
