import com.java.org.AA;
import com.java.org.BB;
//static은 참조가넝~~

public class Ex04 {
	
	public static void main(String[] args) {
//		main이라는 스태틱함수, AMAX,BMAX 메모리에 상주중
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
//		AMAX는 공유, a는 초기화. static int와 int의 차이
//		an.AMAX; 할필요x. 그냥 AMAX;써도됨.
		
		a1.useBMAX();
		a2.useBMAX();
		System.out.println("BB.BMAX = "+BB.BMAX);
//		BB b1= new BB();
		
		
	}
}
