package aa.bb.cc;

import java.util.Scanner;

class Grade {
	private int math;
	private int science;
	private int english;
	
	public Grade(int m, int s, int e) {
		math= m;
		science= s;
		english= e;
	}
	
	public double average() {
		double result = (double)(math+science+english)/3;
		return result; 
		
	}
}

public class Exam02 {
	
	public static void main(String[] args) {
		   // TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.print("����, ����, ���� ������ 3���� ���� �Է� >> ");
		   int math = sc.nextInt();
		   int science = sc.nextInt();
		   int english = sc.nextInt();
		   Grade me = new Grade(math, science, english);
		   System.out.println("����� "+me.average()); // average()�� ����� ����Ͽ� ����
		   
		   sc.close();
		}

}
