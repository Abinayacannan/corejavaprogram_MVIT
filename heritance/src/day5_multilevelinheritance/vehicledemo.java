package day5_multilevelinheritance;

public class vehicledemo {
	public static void main(String[] args) {
		car c;
		c=new car();
		c.vehicleType();
		
		maruti m=new maruti();
		m.vehicleType();
		m.brand();
		m.speed();
		
		maruti800 m1=new maruti800();
		m1.vehicleType();
		m1.brand();
		m1.speed();
		
		
	}

}
