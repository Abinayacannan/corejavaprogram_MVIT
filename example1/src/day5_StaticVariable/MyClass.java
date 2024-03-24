package day5_StaticVariable;
	//Program to demonstrate static block
	public class MyClass {
		private int section; //non-static or instance variable
		private static int srNo; //static or class variable
		//static Block satic varibale tha used 
		
		  static { System.out.println("-----------Within Static Block---------");
		  srNo=1002;
		  }
		 
		
		//default constructor
		MyClass()
		{
			System.out.println("--------------Within Default Constructor-----------");
			srNo++;
			section++;		
		}
		
		@Override
		public String toString() {
			return "MyClass [Serial No "+srNo+", Section=" + section + "]";
		}

		//static method
		static void display() 
		{
		//	System.out.println("Section : "+section); //can't access non static members	
			System.out.println("Serial No. "+srNo); 
		}
	}
