package aa;

/*
 * public protected default private : ������ �޼���
 * ���� ��Ű�� ������ ������ �ٵʤ���
 * */
public class Ex01 {

	public static void main(String[] args) {
		Member m1= new Member();
//		aa.Member m1= aa.Member();
		
//		m1.name = "asdf"
		m1.setName("ȫ�浿");
		m1.setAge(10);
		m1.Print();
	
		
		Member m2= new Member();
		m2.setName("ȫ���");
		m2.setAge(13);
		m2.Print();
	
	}
}
