/*
 * A+B=9
 * A=1 B=1~8
 * A=2 B=1~8
 * */

public class ex03 {
	public static void main(String[] args) {
		int A=0;
//		A=A+1, A+=1, A++
		for (; A < 10 ; A=A+1) {
//			System.out.println("A="+A);
			for(int B =1;B<10;B=B+1) {
//				for 구문 안에서만 B사용: 변수의 스코프
//				System.out.println("B="+B);
				if((A+B)==9)
					System.out.println("A=" +A + "B=" +B);
				
			}
		}
	}

}
