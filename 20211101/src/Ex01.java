import java.util.Scanner;
import com.java.org.Grade; //요거쓰면 밑에 Grade 빨간줄사라짐
/*
 * Grade 클래스를 작성해보자
 * 3과목의 점수를 입력받아 Grade객체를 생성하고 성적평균을 
 * 출력하는 main()과 실행예시는 다음과 같다.
 * */

public class Ex01 {

	public static void main(String[] args) {
		   // TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
		   int math = sc.nextInt();
		   int science = sc.nextInt();
		   int english = sc.nextInt();
		   Grade me = new Grade(math, science, english);
		   System.out.println("평균은 "+me.average()); 
		   // average()는 평균을 계산하여 리턴
		   
		   sc.close();
		}
}
