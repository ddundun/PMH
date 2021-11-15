import aa.AA;

//oop
//객체 지향 프로그래밍
public class Ex02 {

	public static void main(String[] args) {
		int num1ary[] = new int[3];		
		int num2ary[] = new int[3];			
		int num3ary[] = new int[3];		   // 이렇게 여러개만들바엔	
		String nameary[] = new String[3]; //  for 쓰장 ㅣ
				
				
		AA aarray[] = new AA[3]; //AA[i] : 객체생성 i개다!
		
		for(int i=0; i<3; i++) {
			aarray[i] =new AA((i+1)*10,"a"+i); 
		}		
		
		for(int i=0; i<3; i++) {
//			System.out.println("aarray["+i+"]="+aarray[i]);
			aarray[i].doPrint();
			System.out.println();
		}
	}
}


//aarray[0]=aa.AA@7de26db8 : aa패키지안의 AA클래스 주소?