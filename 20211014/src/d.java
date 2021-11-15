
public class d {
/* ctrl s 저장
 * 이클립스에서는 저장 하는 순간 컴파일
 * a.java->a.class
 * */
	public static void main(String[] args) {
		int a=10;
		double b=20;
		b=a;

		System.out.println("b="+b);
		a= (int)b;
		// 둘의 자료형이 달라서 구럼
		// 강제 형변환 필요 a=b; -> a=(int)b;로 바꾸면 에러 사라짐 
		System.out.println("a="+b);
	}
}
