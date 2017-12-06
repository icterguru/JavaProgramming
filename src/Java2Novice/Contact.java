package Java2Novice;

public class Contact{
	private String fname;
	private String lname;
	
	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getContact() {
		return (fname + "  " + lname);		
	}


	public void setContact(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	
	/**
	 * @param fname
	 * @param lname
	 */
	
	public Contact(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	
	@Override
	public String toString() {

		 return "["+ getContact() +"]";
		
//		//return "Contact [fname=" + fname + ", lname=" + lname + ", getFname()="
//				+ getFname() + ", getLname()=" + getLname() + ", getClass()="
//				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
//				+ super.toString() + "]";
//		 
	}
	
	public static void main(String a[]){
		
		Contact c1 = new Contact("Mokter", "Hossain");
		
		System.out.println("c1.fname = " + c1.fname);
		System.out.println("c1.lname = " + c1.lname );
		
		System.out.println("c1.fname.toString() = " + c1.fname.toString());
		System.out.println("c1.lname.toString() = " + c1.lname.toString());
		
		System.out.println("c1.toString() = " + c1.toString());
			
		System.out.println("Hello there...");
	}
	
}