import com.java.org.Rectangle;

public class Ex03 {
	

	public static void main(String[] args) {
		   Rectangle r = new Rectangle(2, 2, 8, 7);
		   r.setName("R");
		   Rectangle s = new Rectangle(5, 5, 6, 6);
		   s.setName("S");
		   Rectangle t = new Rectangle(1, 1, 10, 10);
		   t.setName("T");
		   
		   r.show();
		   System.out.println("s�� ������ "+s.square());
		   if(t.contains(r)) 
			   System.out.println("t�� r�� �����մϴ�.");
		   if(t.contains(s)) 
			   System.out.println("t�� s�� �����մϴ�.");

//		    t�� s�� ���������� ����->11�̶� �Ѿ.
		   else
			   System.out.println("t�� s�� ���������ʴ´�.");
	
	}
}