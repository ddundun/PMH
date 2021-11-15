package aa.bb;
public class Car {
	
	public static int cnt = 0; // 자동차가 만들어질때 마다 ex)시리얼넘버
	private String name;
	private double distance;
	
	//생성자 만드는법: alt shift s -> o
	//게터 세터 만드는법 : alt shift s -> r 	
	public Car() {
		cnt++;
		//기본생성자 호출할때마다 cnt 증가
	}
	
	public Car(String name, double distance) {
		cnt++; //여기도 cnt증가
		this.name = name;
		this.distance = distance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	} 
	public void doPrint() {
		
		System.out.println("name= "+name);
		System.out.println("dis= "+distance+"km");
		System.out.println(cnt+"번째로 만들어졌습니다.");
//		cnt: 공유변수 (public)
	}
	
	
//	생성자로 값을 넣는 방법, 
//	setter방식으로 값 설정
	
	
}
