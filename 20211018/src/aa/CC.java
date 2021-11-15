package aa;

public class CC {
	
	//break;
	public void doA() { //012
		for(int i=0;i<5;i++) {
			if(i==3) 
				break;
			System.out.println("i="+i);
		}
	}
	//continue;
	public void doB() { //0124
		for(int i=0;i<5;i++) {
			if(i==3) 
				continue;
			System.out.println("i="+i);
	}
	}
	//a와 b의 공배수를 출력하자 1~100사이
	public void doC(int a, int b) {
		int count=0;
		int num=0;
		while(num++< 100) {
//			System.out.println("count=" +count);
			if ((num%a==0) && (num%b==0)) {
				count++;
				if (count==3) {
					continue;
					}
				else  {
			System.out.println("num="+num);
				}
//			break; //while탈출?
			}
//				int num=1; while (num<100) 
//				num++이런식으로 쓰거나 저래쓰거나 ㅎㅎ
		}
	}
}