class Boat {
	public void myboat() {
		System.out.println("�̰��� ��Ʈ");
	}
}
/*
 * stack... ����.. �޸� ���� LIFO 
 * �޸� ������ �÷� ���� ����ؾ��� 
 * 1. static...
 * 2. ��ü ����(�ν��Ͻ�ȭ, �޸𸮿� �Ҵ�) 
 * -> non static -> jvm �˾Ƽ� ���� (�޸𸮻�)
 * 
 * */
public class Car {
	public void myCar() {
		System.out.println("�̰��� �� �ڵ���");
	}
	public static void main(String[] args) {
		Car c1= new Car();
		
//		String a[] = {"22","11"};
//		c1.main(a); -> ���ѷ�����. �̷��Զ� ��밡�������� ��������^^!!
 		
//		Car.myCar(); //Car���� myCar �ٷθ��� ->static�ƴϱ⶧��
		c1.myCar(); //c1 ��ü�����Ŀ��� ���ok
//		Boat.myboat();// �����ƶ����� �̰ŵ��ȵʤ�
		
		Boat boat= new Boat();
		boat.myboat();
	}
}
