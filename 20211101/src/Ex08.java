import java.lang.System;

class C{
	public static void doA(String a) {
		System.out.println("static method doA " +a);
		
	}
}
class CS{
	public static C cout= new C();
//	cout税 梓端 c
}
public class Ex08 {

	public static void main(String[] args) {
		CS.cout.doA("aaaa"); //ししし.しし.ししし();
		System.out.println("搾汁馬惟...");
	}
}
