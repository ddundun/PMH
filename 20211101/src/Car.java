class Boat {
	public void myboat() {
		System.out.println("이것은 보트");
	}
}
/*
 * stack... 스택.. 메모리 운영방식 LIFO 
 * 메모리 공간에 올려 놓고 사용해야함 
 * 1. static...
 * 2. 객체 생성(인스턴스화, 메모리에 할당) 
 * -> non static -> jvm 알아서 관리 (메모리상)
 * 
 * */
public class Car {
	public void myCar() {
		System.out.println("이것은 내 자동차");
	}
	public static void main(String[] args) {
		Car c1= new Car();
		
//		String a[] = {"22","11"};
//		c1.main(a); -> 무한루프됨. 이렇게라도 사용가능하지만 쓰지마삼^^!!
 		
//		Car.myCar(); //Car안의 myCar 바로못씀 ->static아니기때문
		c1.myCar(); //c1 객체생성후에나 사용ok
//		Boat.myboat();// 같은맥락으로 이거도안됨ㅎ
		
		Boat boat= new Boat();
		boat.myboat();
	}
}
