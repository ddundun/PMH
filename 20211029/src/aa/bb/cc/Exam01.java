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
		System.out.println(brand+"에서 만든 "+year+ "년형 "+inch+ "인치 TV");
	}
}
public class Exam01 {

	public static void main(String[] args) {
		   TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
		   myTV.show();
		}
	
}
