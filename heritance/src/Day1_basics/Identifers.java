package Day1_basics;
public class Identifers {
		public static void main(String[] args) {
			// variable declaration - Invalid Identifier Examples
			
			/*	int for = 13;// error because keyword cannot be identifier
			System.out.println("value of the number variable is : "+ for);*/
			
			
			  int number2 = 13; //error because do not add space within identifier
			  System.out.println("value of the number variable is : "+ number2);
			 
			
			// error because Identifier can not starts with @, # 
			int _number3 = 10;//_ can be used
			System.out.println(_number3);
			int $number4=45;//$ symbol can be used
			System.out.println("value of the number variable is :"+$number4);
			
			//Valid Identifier Examples
			
			int $number = 20; //starts with $
			System.out.println("value of the number variable is : "+ $number);
		
			String studentName="Aniket"; //use camelcase
			System.out.println("value is : "+ studentName);
			
		
		}

	}
