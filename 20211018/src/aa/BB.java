package aa;
// void뿐, main 함수없기때문에 실행x
public class BB {
	public void doA() {
		int n=3; //지역변수 ..: 여기서만 쓰이고 doA나가면 쓸모x
		switch (n) {
		case 1:
			System.out.println("111111");
		
		case 2:
			System.out.println("222222");
		
		case 3:
			System.out.println("333333");
			
		case 4:
			System.out.println("444444");
			break;
		default:
			System.out.println("default...");
					} }
	
	
	public void doB() {
		int num1=0;
		while (num1<5) {
			System.out.println("num1=" +num1);
			num1 +=1; //밑에거랑같음
//			num1++;
		}
	}

	public void doC(int num1) {
		System.out.println("doC시작");
		for(; num1<5; num1++) {
			System.out.println("num1= "+num1);
		}
	}
}

