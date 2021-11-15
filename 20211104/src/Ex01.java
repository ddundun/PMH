import aa.bb.Car;

public class Ex01 {

	public static void main(String[] args) {
		
//		다른 생성자 선언 시 기본생성자 생략 불가
//		다른 생성자 선언하지 않을 시 기본생성자 생략 가능
		Car car1= new Car(); //기본생성자호출해서 만듬
		car1.doPrint();
		
		Car car2= new Car("k3",20002.2); //다른 매개변수??이용해ㅑ서?? 만듬
		car2.doPrint();
		
		Car car3= new Car("아반떼",2045.2); 
		car3.doPrint();
		
	}
}
