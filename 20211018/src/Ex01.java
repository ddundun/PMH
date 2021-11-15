/*
 * 32bit -> 64bit
 * 32bit -> 4byte
 * 
 * int 4byte
 * ctrl +1 빠른 에러 처리
 * */
public class Ex01 {

	public static void main(String[] args) {
		int num1=10;
		
		System.out.println(+num1);
		System.out.println(-num1);
		
		short num2=20;
		System.out.println(+num2);
		num2= (short) -num2;
//		왜 short지??
//		자바의 기본형은 int(?)라 short라 쳐준듯??
		
		System.out.println(num2);

	}
}
