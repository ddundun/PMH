class MyCls {
	public void doA() {
		StCls st4= new StCls();
		st4.print();
	}
}
public class StCls {

	int a = 10;
	static int b =20; 
	//static : �������� /������������ ��?
	//���α׷� ����ñ��� �ٰ��� ����
	
	//������ constructor: class��� ���ƾ���
	StCls() {
		a++;
		b++;
	}
	public void print() {
		System.out.println("a= "+a);
		System.out.println("b ="+b);
		//���⼭ st1,st2,st3�� ����b�� �� 
		//�׷��� a�� ����, b�� ����
		
	}
}
