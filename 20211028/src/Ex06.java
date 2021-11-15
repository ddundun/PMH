
public class Ex06 {
	public static void main(String[] args) {
		zoo.Cat c1 = new zoo.Cat(); //import 대신 쓰는 방법
		Cat(c1); //cat함수 c1으로 복사?
//		c1. a();
//		c1. b(); 
//		Cat.a(); 이건 불가능~ Cat선언안됬기(클래스생성x)때문에~
	}

	public static void Cat (zoo.Cat c) { //cat함수 c로 복사?
		c.a();
//		c.b();
	}
}
