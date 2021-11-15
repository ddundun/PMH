package aa;

public class Member {
	
	private String name;
	private int age;
	
	void setName(String name) {
		this.name = name;
	}
	//alt shift s r
	void setAge(int age) {
		this.age = age;
	}
	
	//public지워도 같은 패키지 내라서 다됨!
	void Print() {
		System.out.println("Member Class");
		System.out.println("name = "+name);
		System.out.println("age = "+age);
	}

}
