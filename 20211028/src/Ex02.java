import aa.AA;

//oop
//��ü ���� ���α׷���
public class Ex02 {

	public static void main(String[] args) {
		int num1ary[] = new int[3];		
		int num2ary[] = new int[3];			
		int num3ary[] = new int[3];		   // �̷��� ����������ٿ�	
		String nameary[] = new String[3]; //  for ���� ��
				
				
		AA aarray[] = new AA[3]; //AA[i] : ��ü���� i����!
		
		for(int i=0; i<3; i++) {
			aarray[i] =new AA((i+1)*10,"a"+i); 
		}		
		
		for(int i=0; i<3; i++) {
//			System.out.println("aarray["+i+"]="+aarray[i]);
			aarray[i].doPrint();
			System.out.println();
		}
	}
}


//aarray[0]=aa.AA@7de26db8 : aa��Ű������ AAŬ���� �ּ�?