import com.java.org.AA;
import com.java.org.BB;
//static�� ��������~~

public class Ex04 {
	
	public static void main(String[] args) {
//		main�̶�� ����ƽ�Լ�, AMAX,BMAX �޸𸮿� ������
//		
		
		AA a1= new AA();
		System.out.println("a1.a= "+a1.a);
		System.out.println("a1.AMAX="+AA.AMAX);
		
		a1.addE();
		System.out.println("a1.a= "+a1.a);
		System.out.println("a1.AMAX="+AA.AMAX);
		
		System.out.println();
		
		AA a2= new AA();
		System.out.println("a2.a= "+a2.a);
		System.out.println("a2.AMAX="+AA.AMAX);
		a2.addE();
		System.out.println("a2.a= "+a2.a);
		System.out.println("a2.AMAX="+a2.AMAX);
//		AMAX�� ����, a�� �ʱ�ȭ. static int�� int�� ����
//		an.AMAX; ���ʿ�x. �׳� AMAX;�ᵵ��.
		
		a1.useBMAX();
		a2.useBMAX();
		System.out.println("BB.BMAX = "+BB.BMAX);
//		BB b1= new BB();
		
		
	}
}
