package day5_static;

public class staticmethod {
	int id=102;
	static int rollno=2;
	static{
		System.out.println("Static Block");
		//we cannot accees non-static variable
		//System.out.println("id" +id);
		System.out.println("roll no" +rollno);
		

		
		
	}
//default constructor
	public staticmethod()
	//constructor can use static variable and non-static variable also
	{System.out.println("id"+id);
	System.out.println("roll no"+rollno);
		
	}
	//concrete method or normal method
	void display()
	{
		System.out.println("normal method");
		System.out.println("id" +id);
		System.out.println("roll no"+rollno);
	}
	void print()
	{
		System.out.println("static method");
		//System.out.println("id"+id);
		System.out.println("roll no"+rollno);
	}
	
}
