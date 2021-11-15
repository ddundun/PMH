package aa;

public class BankAccount {
	public int bal = 0;
	public String accNumber;
	public String ssNumber;
	
//	BankAccount() {} 원래 이 기본생성자 안적어줘도 자동으로 생성해주는데,
//	새롭게 생성자 생성하면 위에거 사라지는 현상있음
//	사라지면 새로 적어주면됨!
	
	public BankAccount() {}
//	생성자 함수...constructor ... 초기화메서드
	public BankAccount(String acc, String ss, int b) {
		accNumber = acc;
		ssNumber =ss;
		bal =b;
		
	}
	public void deposit(int num) {
		bal += num;
	}
//	ctrl + shift + f 자동정렬
	public void checkMybal() {
		System.out.println("계좌번호:" +accNumber);
		System.out.println("주민번호:" +ssNumber);
		System.out.println("금액: " + bal);
		
	}
	public void init(String acc,String ss,int b) {
		accNumber= acc;
		ssNumber= ss;
		bal = b;
//		init함수 호출하면 세가지값 보냄
	}
}
