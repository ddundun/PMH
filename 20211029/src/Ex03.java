/*
 * 
 * 
 * 
 * */
class Point {
	int xPos, yPos;
	public Point(int x, int y) {
		xPos= x;
		yPos= y;
}
	public void showPointInfo() {
		System.out.println("["+xPos+","+yPos+"]");
		}
	}
class Circle {
	Point p1;
	int r;
	public Circle(int x, int y, int rad) {
		p1 = new Point(x,y);
		r =rad;
	}
	public void showPointInfo() {
		p1.showPointInfo();
		System.out.println("["+r+"]");
		System.out.println("좌표["+p1.xPos+","+p1.yPos+"] 반지름 "+r+"인 원");
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Circle c= new Circle(2,2,4);
		c.showPointInfo();
	}

}
