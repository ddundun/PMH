class Circle {// 원래는 하나의 파일엔 한클래스만
	private double rad =0;
	final double PI = 3.14;
	public Circle (double r) {
		rad= r;
	}
	public void setRad(double r) {
		if(r<0) { rad =0; return; }
		rad = r;
	}
	public double getArea() {
		return rad * rad * PI;
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Circle c = new Circle(3.5);
		System.out.println("c 넓이는 = " +c.getArea());
		
		c.setRad(2.5);
		System.out.println("c 넓이는 = " +c.getArea());
		
		c.setRad(-3.5);
		System.out.println("c 넓이는 = " +c.getArea());
		
//		c.rad= -4.5; // private 쓰면 이거 오류뜸
		System.out.println("c 넓이는 = " +c.getArea());

	}

}
