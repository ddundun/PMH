package aa;

/*
 * public protected default private : 변수와 메서드
 * 같은 패키지 내에선 위에거 다됨ㅎㅎ
 * */
public class Ex01 {

	public static void main(String[] args) {
		Member m1= new Member();
//		aa.Member m1= aa.Member();
		
//		m1.name = "asdf"
		m1.setName("홍길동");
		m1.setAge(10);
		m1.Print();
	
		
		Member m2= new Member();
		m2.setName("홍길순");
		m2.setAge(13);
		m2.Print();
	
	}
}
