
public class Ex02 {

	public static void main(String[] args) {
	
		A a= new A();
		B b= new B();
		
		ABC abc = new ABC(); //��ü����
		//�Ű�����(a,b,c) �־���� ȣ���̵�
		abc.takeC(new C());
		abc.takeA(a); 
		abc.takeB(b);
		//���������� ���ư��°ǰ���. C c=new C(); 
		//��ü������ �ȵȰǰ�..?

		System.out.println();
		abc.seqtake(new A(), new B(), new C());
		// �̷����ϸ� ���� ������
	
	}
}
