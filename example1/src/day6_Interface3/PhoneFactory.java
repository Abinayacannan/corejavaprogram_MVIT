package day6_Interface3;
	//Program to define factory method
	public class PhoneFactory {
		public static Phone createPhone(String company) {
			if (company.equalsIgnoreCase("Samsung"))
				return new Samsung();
			else if (company.equalsIgnoreCase("Jio"))
				return new Jio();
			return null;
		}
	}

