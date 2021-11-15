package aa;

public class QQ {
	


	public void doA(int a, int b) {
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"÷"+b+"="+(a/b));
		System.out.println(a+"÷"+b+"의 나머지="+(a%b));
	}
	
	public void doB(int num1, int num2) {
		int diff=0;
		if(num1>num2) {
			diff = num1-num2;
			System.out.println("절대값:"+diff);
		} 
		else if(num2>num1) {
			diff=num2-num1;
			System.out.println("절대값:"+diff);
		}

	}
	
	public void doC(double num) {
		double result1 = num*num*3.14;
		double result2= 2*num*3.14;
		
		System.out.println("원의 넓이=" +result1);
		System.out.println("원의 둘레=" +result2);

	}
	

}
