
public class Ex02 {

	public static void main(String[] args) {
	
		A a= new A();
		B b= new B();
		
		ABC abc = new ABC(); //객체생성
		//매개변수(a,b,c) 넣어줘야 호출이됨
		abc.takeC(new C());
		abc.takeA(a); 
		abc.takeB(b);
		//내용적으로 돌아가는건같음. C c=new C(); 
		//객체생성이 안된건가..?

		System.out.println();
		abc.seqtake(new A(), new B(), new C());
		// 이렇게하면 순서 고정ㄴ
	
	}
}
