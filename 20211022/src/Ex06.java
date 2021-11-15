import aa.BankAccount;

public class Ex06 {
	public static void main(String[] args) {
//		int c=10;
		BankAccount a= new BankAccount();
		BankAccount b= new BankAccount();
//		BankAccount:자료형type /int같은 역할(?)
		
		a.deposit(1000);
		b.deposit(2000);
		
		a.checkMybal();
		b.checkMybal();

	}

}
