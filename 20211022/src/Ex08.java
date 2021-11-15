import aa.BankAccount;

public class Ex08 {

	public static void main(String[] args) {
//		여기선 객체생성하고 함수만들어서 ..?
		BankAccount a1= new BankAccount();
		a1.init("계좌번호 1111","주민번호 1111",1000);
		
		BankAccount a2= new BankAccount();
		a2.init("계좌번호 2222","주민번호 2222",2000);	
		
//		class안 a1안에있는 checkMybal
		a1.checkMybal();
		a2.checkMybal();
		
//		초기화 메서드, 생성자, constructor
	}
}
