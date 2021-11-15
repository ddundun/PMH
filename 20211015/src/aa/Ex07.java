package aa;

public class Ex07 {
	public static void main(String[] args) {
		int num1 =10;
		int num2 =20;
		boolean result;
		
		result= num1<100 && (num2 += 10)<10;
//		&&이거라 앞에거가 거짓이면 뒤에거 어차피안함
//		num1<100이게 false기때문에 뒤에거안함
		System.out.println("result=" +result);
		System.out.println("num1=" +num1);
		System.out.println("num2=" +num2);

		result= num1<100 || (num2 += 10)<100;
//		 이건 그래도 ||라 한번해봄 .. 맞나...? 		
		System.out.println("result=" +result);
		System.out.println("num1=" +num1);
		System.out.println("num2=" +num2);
	}
}
