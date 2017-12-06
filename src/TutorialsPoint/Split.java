package TutorialsPoint;


public class Split {

	public static void main (String agrs[])
	{

		String names = "Mosaddek,Hossain,Mahdi,Muhaimin,Hossain,Munim";

	
		String nameArray[] = names.split(",");


		for(String n: nameArray)
		{
			System.out.println(n);
		}

	}

}
