import aa.bb.Car;

public class Ex01 {

	public static void main(String[] args) {
		
//		�ٸ� ������ ���� �� �⺻������ ���� �Ұ�
//		�ٸ� ������ �������� ���� �� �⺻������ ���� ����
		Car car1= new Car(); //�⺻������ȣ���ؼ� ����
		car1.doPrint();
		
		Car car2= new Car("k3",20002.2); //�ٸ� �Ű�����??�̿��ؤ���?? ����
		car2.doPrint();
		
		Car car3= new Car("�ƹݶ�",2045.2); 
		car3.doPrint();
		
	}
}
