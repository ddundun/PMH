class AAA {
	public static int AAAA = 1000;
}
public class Ex05 {
	public static int num=100;
	public static String a= "aaaa";
	
	
	public static void main(String[] args) {
		Ex05.num -=10;
		System.out.println("Ex05.num = " +Ex05.num);
	
		System.out.println("EX05.a = "+Ex05.a);
		AAA.AAAA-=150;
		System.out.println("AAA.AAAA= "+AAA.AAAA);
	}
}
// static을 공유해서 쓴다~