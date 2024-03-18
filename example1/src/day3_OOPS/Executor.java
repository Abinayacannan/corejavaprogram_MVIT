package day3_OOPS;
 public class Executor {
public static void main(String [] args)
{
	customer c1=new customer();
	c1.setCid(112);
	c1.setCaddress("Puducherry");
	System.out.println("Customer id" +c1.getCid() +"Customer name"+c1.getCname() +"Customer Address" +c1.getCaddress());
	customer c2=new customer();
    c2.setCid(113);
    c2.setCname("Abinaya");
    c2.setCaddress("Chennai");
    System.out.println(c2);//calling tostring
    customer c3 = new customer();//invoke implicit default constructor
    System.out.println(c3);
    customer c4=new customer(102,"Sabari","TN");//invoke parameterized constructor
    System.out.println(c4);
    customer c5=new customer();
    c5.setCid(113);
    c5.setCname("Abinaya");
    c5.setCaddress("Chennai");
    System.out.println(c5);
    }
}
