package com.java.org;

public class Song {

	private String title;
	private int year;
	private String artist;
	private String country;
	
	public Song() {} //��ȯ���� ���� Ŭ�������̶� ������ �� = �⺻������
	
	public Song(String t, int y, String a, String c) {
		title = t;
		year = y;
		artist = a;
		country = c;
	}

	public void show() {
		System.out.println("title ="+title);
		System.out.println("year="+year);
		System.out.println("artist="+artist);
		System.out.println("country="+country);
	}
}
