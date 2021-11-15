class MyCls {
	public void doA() {
		StCls st4= new StCls();
		st4.print();
	}
}
public class StCls {

	int a = 10;
	static int b =20; 
	//static : 공유변수 /전역변수보다 위?
	//프로그램 종료시까지 다같이 공유
	
	//생성자 constructor: class명과 같아야함
	StCls() {
		a++;
		b++;
	}
	public void print() {
		System.out.println("a= "+a);
		System.out.println("b ="+b);
		//여기서 st1,st2,st3이 같은b를 씀 
		//그래서 a는 고정, b만 증가
		
	}
}
