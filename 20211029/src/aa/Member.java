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
	
	//public������ ���� ��Ű�� ���� �ٵ�!
	void Print() {
		System.out.println("Member Class");
		System.out.println("name = "+name);
		System.out.println("age = "+age);
	}

}
