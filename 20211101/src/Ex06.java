class BBB {
	public static void doA() {//static
		System.out.println("doA");
	}
	public void doB() { //�׳ɸ޼���
		System.out.println("doB");
	}
}
public class Ex06 {

	public static void main(String[] args) {
		
		BBB.doA();
//		BBB.doB(); ȣ��Ұ���.. static�ƴ϶� ��
//		ctrl+shift+c:�ּ�
		BBB b1= new BBB(); //�̰� �����ϸ�
		b1.doB(); //�̷������� ����
	}
}
