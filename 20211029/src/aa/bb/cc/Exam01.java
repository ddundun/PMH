package aa.bb.cc;

class TV {
	private String brand;
	private int year;
	private int inch;
	TV(String b,int y, int i) {
		brand= b;
		year= y;
		inch=i;
		
	}
	public void show() {
		System.out.println(brand+"���� ���� "+year+ "���� "+inch+ "��ġ TV");
	}
}
public class Exam01 {

	public static void main(String[] args) {
		   TV myTV = new TV("LG", 2017, 32); //LG���� ���� 2017�� 32��ġ
		   myTV.show();
		}
	
}
