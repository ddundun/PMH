package com.java.org;

public class AA {
//	static : 프로그램시작해서 끝날때까지 메모리 상주
	public static int AMAX=0;
	public int a= 10;

	public void addE() {
		AMAX+=10;
		a++;
	}
	public void useBMAX() {
		System.out.println("BB.BMAX++"+BB.BMAX++);
	}
}
