class PAA {
	int num;

}

public class AA extends PAA {
	public AA() {
		System.out.println("num="+num);
		System.out.println("�Ϸ� �´�.");
	}
	public static void main(String[] args) {
		AA a1= new AA();
	}
}