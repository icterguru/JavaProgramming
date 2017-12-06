package TutorialsPoint;


public class StringBuilder {
	String name = "Mokter";
	

	public  StringBuilder(String name) {
		// TODO Auto-generated constructor stub
	 this.name = name;
		
	}

	public static void main (String agrs[])
	{
		StringBuilder sb = new StringBuilder("Mokter"); 
		
		
		//System.out.println(sb.toString());
		System.out.println(sb);
	}

	@Override
	public String toString() {
		return name ;
	}

}
