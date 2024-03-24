//Bank interface
package day6_Interface2;

public interface Bank{//Interface just declare
	 double    MIN_BALANCE = 1000;
	 double  DEPOSIT_LIMIT = 25000;
	 double INTEREST_RATE = 7.8;

	 void deposit(Account account, double amount);
	 void withdraw(Account account, double amount);
	}