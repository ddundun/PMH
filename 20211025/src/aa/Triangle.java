package aa;

public class Triangle {
	int base; //밑변
	int height; //높이
	
	//public Triangle() {} 기본생성자 생략되어져있다. jvm이 삽입해줌
	
	// 인자값이 있는 생성자 선언시 기본생성자는 생략불가.
	public Triangle(int b, int h) {
		base = b;
		height = h;
		}
	
	public double traArea() {
		return (double)(base*height)/2;
	}
}
