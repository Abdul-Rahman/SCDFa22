/*It contains three properties id, name and address(dependent object) ,two constructors and show() 
  method to show the records of the current object including the depedent object.
*/
package alphapeeler;

public class Employee {
	private int id;  
	private String name;  
	private Address address;//Aggregation  
	  
	public Employee() {System.out.println("def cons");}  
	  
	public Employee(int id, String name, Address address) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.address = address;  
	}  
	  
	void show(){  
	    System.out.println(id+" "+name);  
	    System.out.println(address.toString());  
	}  
	  
	}  