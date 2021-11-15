// 보통 파일제목은 대문자가 관례
package aa; 
//패키지 명은 마음대로 지을수있음
//패키지가 선언되어 있지 않으면 src폴더안에...여러파일이 존재

public class Ex01 {
	public static void main(String args[]) {
		int MIN_SIZE=200;
		final int MAX_SIZE =100;
		System.out.println("MAX_SIZE = " +MAX_SIZE);
//		MAX_SIZE=200;  에러뜬다고함. final은 c언어의 const?
		System.out.println("MIN_SIZE = " +MIN_SIZE);
		MIN_SIZE =300; //변경 가능
		System.out.println("MIN_SIZE = " +MIN_SIZE);
}
}
