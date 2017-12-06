package Aggregation;
// http://www.javatpoint.com/aggregation-in-java

public class Employee {  
	int id;  
	String name;  
	Address address;  

	public Employee(int id, String name,Address address) 
	{  
		this.id = id;  
		this.name = name;  
		this.address=address;  
	}  

	void display(){  
		System.out.print("Employee " + name + " " +  id + " lives at: ");  
		System.out.println(address.city+" "+address.state+" "+address.country);  
	}  

	public static void main(String[] args) 
	{  
		Address address1=new Address("Tuscaloosa","AL-35401","USA");  
		Address address2=new Address("Dallas","TX-752005","USA");  

		Employee e=new Employee(111,"Varun",address1);  
		Employee e2=new Employee(112,"Arun",address2);  

		e.display();  
		e2.display();  

	}  
}  

class Address {  
	String city,state,country;  

	public Address(String city, String state, String country) 
	{  
		this.city = city;  
		this.state = state;  
		this.country = country;  
	}  

}  