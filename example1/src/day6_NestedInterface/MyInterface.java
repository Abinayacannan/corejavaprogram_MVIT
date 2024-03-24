package day6_NestedInterface;
	//Nested Interface

	public interface MyInterface {//just declare the method
		 void calculateArea();
		    interface MyInnerInterface {//nested interface
		       int  id = 20;
		       void print();     
		    }
	}