package staticvariable;



//  http://www.javatpoint.com/static-keyword-in-java

public class Student {

	int rollno;  
	String name;  
	static String college ="IIT";  

	Student(int roll_no,String _name){  
		rollno = roll_no;  
		name = _name;  
	}  
	void display (){System.out.println(rollno+" "+name+" "+college);}  

	final public  static  void main(String[] args) {
	
		Student s1 = new Student(111,"Mahdi");  
		Student s2 = new Student(222,"Munim");  

		s1.display();  
		s2.display();  
	}

}
