
public class ex07 {
	
	public static void main(String[] args) {
		int a=10;
		if(a==10) {
			int num=20;
			System.out.println("num=" +num);
//			num은 if절 안에서만 사용가능
		}
		if (a==20) {
			int num=30;
			System.out.println("num=" +num);
		}
//		num=30;
//		System.out.println("num = "+num);	
		System.out.println("a= "+a);
//			변수 a는 메인함수안에있어서 빨간줄안생김
	}
	
	{
		int b=20;
		int aa=30;
	}
	
	
	

}
