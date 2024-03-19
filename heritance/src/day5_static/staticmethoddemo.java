package day5_static;

public class staticmethoddemo {
	static
	{
		System.out.println("Static in main file");
	}
	public static void main(String[] args) {
		System.out.println("Main function");
		staticmethod sm=new staticmethod();
	}

}
