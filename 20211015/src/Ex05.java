// �ڵ�����ȯ�� �ǹ�?
/*
 * class��� ���ϸ��� �����ؾ���
 * ctrl +1 �ϸ� ���������ذᰡ���� ! 
 * */
public class Ex05 {

	public static void main(String[] args) {
		int num1=100;
		long num2= 3147483647L;        //3147483647
		System.out.println(num1+num2); //3147483747
//		int�� long�� ���ߴµ� long���� (�ڵ�����ȯ)��
//		
		int num3=(int)(num1+num2); //���� ����ȯ�� �ϴ��� ���� �̻��� (���������ȯ)
		//int num3�� long num2�� �����ϱ� �ȵ�! ->�����پ����� ���׻���� ����..
		long num4= num1+num2;
		System.out.println("num3= " +num3);
		System.out.println("num4= " +num4);
	}
}
