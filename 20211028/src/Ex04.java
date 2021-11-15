import aa.Car;

public class Ex04 {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.doPrint();
		
		//c1.in_area = 30;
		//private 사용하면 c1.in_area=30 이런식으로 값 못넣음
		System.out.println();
		
		c1.setIn_area(30);
		c1.setName("자동차");
		c1.setHeight(180);
		c1.doPrint();
	}
}
