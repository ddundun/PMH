package com.java.org;

public class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;
	private String name;
	
//	public Rectangle() {} �̰� �Ƚᵵ��°�
//  ������ �޼��� Ŭ���������� �ʱ�ȭ �ϰ��ֽ��ϴ�. (class��..?)
	
	public Rectangle(int x,int y,int width,int height) {
		this.x= x;
		this.y= y;
		this.width= width;
		this.height=height;
	}
	public void setName(String name) {this.name= name;}
//	setter ������� class ������ �ʱ�ȭ �� �����ִ�.
	public void setX(int x) {this.x= x;}
	
	public int square() {
		return width*height;
	}
	public void show() {
		System.out.println("name="+name);
		System.out.println("x= "+x);
		System.out.println("y="+y);
		System.out.println("���̴�="+square());
		
	}

	public boolean contains(Rectangle r) {
		if ((x +width )> (r.x+r.width)) {
			if ((y+height)> (r.y+r.height)) {
//				System.out.println("���ԵǾ��ִ�.");
				return true;
			}
		}
		return false;
	}
	
}
