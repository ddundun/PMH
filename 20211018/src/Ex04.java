import java.util.Scanner;

import aa.AA;

// #include <stdio.h>
// #include <stdlib.h>
//
public class Ex04 {
	public static void main(String[] args) {
//		스캐너함수 스캔으로 선언
	Scanner scan = new Scanner(System.in); //스캔 생성
	System.out.println("숫자 입력: "); 
	int a= scan.nextInt(); //scanf라고 생각
	System.out.println("a ="+a);
	
	AA a1= new AA();
//	new를 기억하장
	
	a1.doA();
	
	}

}
