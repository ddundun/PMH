
public class d {
/* ctrl s ����
 * ��Ŭ���������� ���� �ϴ� ���� ������
 * a.java->a.class
 * */
	public static void main(String[] args) {
		int a=10;
		double b=20;
		b=a;

		System.out.println("b="+b);
		a= (int)b;
		// ���� �ڷ����� �޶� ����
		// ���� ����ȯ �ʿ� a=b; -> a=(int)b;�� �ٲٸ� ���� ����� 
		System.out.println("a="+b);
	}
}
