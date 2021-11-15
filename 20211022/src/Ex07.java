import aa.BankAccount;

public class Ex07 {

	public static void main(String[] args) {
		
		BankAccount ref1= new BankAccount();
		BankAccount ref2 = ref1;
//		BankAccount ref2= new BankAccout();
//		이렇게 해야 새로운 공간 만들어짐!
		ref1.deposit(1000);
//		ref1을 넣고
		ref2.checkMybal();
//		ref2를출력해도 값나옴.
		
		ref2.deposit(2000);
		ref1.checkMybal();
		
		check(ref1);
		System.out.println("acc에서 바꿈");
		ref1.checkMybal();
		ref2.checkMybal();
		
		ref1= null;
		if (ref1== null) {
			System.out.println("연결 끊김");
		}
		if (ref2 !=null) {
			System.out.println("ref2는 연결중..");
		}

		
	}
	public static void check(BankAccount acc) {
		acc.bal=5000;
	}
}
