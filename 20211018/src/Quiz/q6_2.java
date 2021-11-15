package Quiz;

public class q6_2 {
	public static void main(String[] args) {
		int sum=0;
		int count=0;
		for (int i=1; i<1000; i++) {
			if(i%2 ==0) { 
				sum+=i;
				continue;}
		
			else if(sum > 1000) {
				   count++;
	                System.out.println(i);
	                System.out.println(sum);
	                break;
	            }
		}}}
