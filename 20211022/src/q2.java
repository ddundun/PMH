
public class q2 {

	public static void main(String[] args) {
		int n=20;
		System.out.println("�ؿ������� �����б�..");
		System.out.println(fact(n));
		
	}
	
	public static int fact(int num) {
		if(num==1) 
			return num;
		else
			System.out.println(num%2);	
			return fact(num/2);
	}
}
