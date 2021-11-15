package quiz;

public class Circle {
	int xPos, yPos;
	int zPos=0;
	public Circle(int x, int y, int z ) {
		xPos= x;
		yPos= y;
		zPos= z;
	}
	public void showCircleInfo() {
		if (xPos<0 || yPos<0 || zPos<0) return;
		System.out.println("좌표["+xPos+","+yPos+"] 반지름 "+zPos+"인 원");
	}
}
