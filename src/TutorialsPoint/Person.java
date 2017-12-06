package TutorialsPoint;

public class Person {

	private String fname;
	private String lname;
	/**
	 * @param fname
	 * @param lname
	 */
	public Person(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	
	@Override
	public String toString() {
		return "This Person's First Name: " + fname + ", and Last Name: " + lname;
	}	
		
	}
