package aa.bb;
public class Car {
	
	public static int cnt = 0; // �ڵ����� ��������� ���� ex)�ø���ѹ�
	private String name;
	private double distance;
	
	//������ ����¹�: alt shift s -> o
	//���� ���� ����¹� : alt shift s -> r 	
	public Car() {
		cnt++;
		//�⺻������ ȣ���Ҷ����� cnt ����
	}
	
	public Car(String name, double distance) {
		cnt++; //���⵵ cnt����
		this.name = name;
		this.distance = distance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	} 
	public void doPrint() {
		
		System.out.println("name= "+name);
		System.out.println("dis= "+distance+"km");
		System.out.println(cnt+"��°�� ����������ϴ�.");
//		cnt: �������� (public)
	}
	
	
//	�����ڷ� ���� �ִ� ���, 
//	setter������� �� ����
	
	
}
