import aa.AA;

public class Ex01 {
	
	public static void main(String[] args) {
		AA a1 =new AA();
		a1.doPrint(); // 초기화하지않으면(=값안넣어주면) 0으로뜸
						//String은 null로 뜸
		
		AA a2= new AA(100);
		a2.doPrint();
		
		AA a3= new AA(200,"a3");
		a3.doPrint();
	}

}
