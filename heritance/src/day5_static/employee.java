//employee entity to show static variables
package day5_static;

public class employee {
	//instance variable
	String name;
	int id;
	static String companyname="TNS"; //static variable as the company remains same
	employee(String name,int id)
	
	{
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
		return "employee [name=" + name + ", id=" + id + "Company Name" +companyname +"]";
	}
	

}
