package aa;

public class BB {
	
	public void doA() {}
	
	public int doB() {
		return 1;
//		1.2는 double이라 안됨ㅎ
	}
	
	public double doC() {
		return 1;
	}
	
	public void doD(int a) {
		System.out.println("출력");
		if(a==1)
		return; //반환값없이 종료
		else
			System.out.println("a는 1이 아닙니다.");
	}

}
