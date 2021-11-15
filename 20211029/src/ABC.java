class A{
	public void take() {
		System.out.println("Aæ‡ ∏‘¿Ω");
	}
}
class B {
	public void take() {
		System.out.println("Bæ‡ ∏‘¿Ω");
	}
}
class C {
	public void take() {
		System.out.println("cæ‡ ∏‘¿Ω");
	}
}

public class ABC {
	public void takeA(A a) {
		a.take();
	}
	public void takeB(B b) {
		b.take();
	}
	public void takeC(C c) {
		c.take();
	}
	public void seqtake(A a,B b, C c) {
		a.take();
		b.take();
		c.take();
	}
	

}
