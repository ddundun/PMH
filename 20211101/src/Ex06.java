class BBB {
	public static void doA() {//static
		System.out.println("doA");
	}
	public void doB() { //그냥메서드
		System.out.println("doB");
	}
}
public class Ex06 {

	public static void main(String[] args) {
		
		BBB.doA();
//		BBB.doB(); 호출불가능.. static아니라서 ㅜ
//		ctrl+shift+c:주석
		BBB b1= new BBB(); //이거 실행하면
		b1.doB(); //이런식으론 가능
	}
}
