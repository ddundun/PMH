/*
 * 10진수
 * 8진수
 * 16진수 
 * */

public class Ex02 {
	public static void main(String[] args) {
		int a= 10;
		int b= 010; //8 다음에 10이라 8?
		int c= 0x10; //16진수에선 15가 젤큰숫자
		
//		그래픽쪽 개발자는 16진수 사용. 그외엔 글쎄...
		System.out.println("a = " +a);
		System.out.println("a = " +b);
		System.out.println("a = " +c);
		}
	}

