import java.util.Scanner;

import aa.AA;

// #include <stdio.h>
// #include <stdlib.h>
//
public class Ex04 {
	public static void main(String[] args) {
//		��ĳ���Լ� ��ĵ���� ����
	Scanner scan = new Scanner(System.in); //��ĵ ����
	System.out.println("���� �Է�: "); 
	int a= scan.nextInt(); //scanf��� ����
	System.out.println("a ="+a);
	
	AA a1= new AA();
//	new�� �������
	
	a1.doA();
	
	}

}
