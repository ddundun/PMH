import java.lang.System;

class C{
	public static void doA(String a) {
		System.out.println("static method doA " +a);
		
	}
}
class CS{
	public static C cout= new C();
//	cout의 객체 c
}
public class Ex08 {

	public static void main(String[] args) {
		CS.cout.doA("aaaa"); //ㅇㅇㅇ.ㅇㅇ.ㅇㅇㅇ();
		System.out.println("비슷하게...");
	}
}
