//Main class for Bank application
package day6_Interface2;
public class BankApplication {
 public static void main(String[] args) {
     // Create a Bank instance
     BankImpl bank = new BankImpl();

     // Create an Account
     Account account = new Account(123456, "Mihir", 900, bank);

     // Deposit money
     account.deposit(20);
     // Print the account details
     System.out.println(account);
     
     //withdraw money
     account.withdraw(500);
     // Print the account details
     System.out.println(account);
 }
}