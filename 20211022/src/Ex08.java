import aa.BankAccount;

public class Ex08 {

	public static void main(String[] args) {
//		���⼱ ��ü�����ϰ� �Լ����� ..?
		BankAccount a1= new BankAccount();
		a1.init("���¹�ȣ 1111","�ֹι�ȣ 1111",1000);
		
		BankAccount a2= new BankAccount();
		a2.init("���¹�ȣ 2222","�ֹι�ȣ 2222",2000);	
		
//		class�� a1�ȿ��ִ� checkMybal
		a1.checkMybal();
		a2.checkMybal();
		
//		�ʱ�ȭ �޼���, ������, constructor
	}
}
