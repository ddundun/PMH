package aa;

public class BB {
	
	public void doA() {}
	
	public int doB() {
		return 1;
//		1.2�� double�̶� �ȵʤ�
	}
	
	public double doC() {
		return 1;
	}
	
	public void doD(int a) {
		System.out.println("���");
		if(a==1)
		return; //��ȯ������ ����
		else
			System.out.println("a�� 1�� �ƴմϴ�.");
	}

}
