package aa.bb.cc;

class Song {
	private String title;
	private String artist;
	private String year;
	private String country;
	Song(String y, String c, String a, String t){
		title=t;
		artist=a;
		year=y;
		country=c;
	}
	public void show()
	{
		System.out.println(year+"년,"+country+"국적의"+artist+"가 부른"+title)
;}
	
}
public class Exam03 {
	
	public static void main(String[] args) {
		Song s1= new Song("1978","스웨덴","ABBA","DancingQueen");
		s1.show();
	}

}

