
public class q1 {

	public static void main(String[] args) {
		int n=5;
		System.out.println(fact(n+1));
	}
	
	public static int fact(int num) {
		if(num==1) {
			return num;}
		else {
			return 2*fact(num-1);
		}
	}
}
