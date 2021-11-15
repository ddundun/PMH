// 자동형변환의 의미?
/*
 * class명과 파일명은 동일해야함
 * ctrl +1 하면 빠른에러해결가능함 ! 
 * */
public class Ex05 {

	public static void main(String[] args) {
		int num1=100;
		long num2= 3147483647L;        //3147483647
		System.out.println(num1+num2); //3147483747
//		int와 long을 더했는데 long으로 (자동형변환)됨
//		
		int num3=(int)(num1+num2); //강제 형변환을 하더라도 값이 이상함 (명시적형변환)
		//int num3에 long num2를 넣으니까 안됨! ->빨간줄없을때 버그생기면 힘듬..
		long num4= num1+num2;
		System.out.println("num3= " +num3);
		System.out.println("num4= " +num4);
	}
}
