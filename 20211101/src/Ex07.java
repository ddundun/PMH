class A {
	static int num=0;
	static void addNum(int n) {
		num += n;
	}
}
public class Ex07 {

//	A.addNum(100);
	A a= new A(); // 이게 만들어져야 int num이 메모리에 상주
//	a.addNum(10);
}
