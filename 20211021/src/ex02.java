/*
 * 문제1
 * 구구단의 짝수 답안 2,4,6,8단만 출력하는 프로그램을 작성하되
 * 2*2까지, 4단은 4*4까지, 6단은 6*6까지 8단은 8*8까지
 * */

/*
 * 문제2
 * AB
 * +BA
 * 99	
 * */
public class ex02 {

	public static void main(String[] args) {
		
		for(int dan=2; dan<9 ;dan+=2) {
			for(int i=1; i<dan+1; i++) {
//			System.out.println("dan= "+dan);
//			System.out.println("i="+i);
			System.out.println(dan+"*"+i+"="+dan*i+"\t");
				}
		System.out.println();	
		}
	}
}
