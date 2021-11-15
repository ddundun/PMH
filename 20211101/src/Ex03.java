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
		   System.out.println("s의 면적은 "+s.square());
		   if(t.contains(r)) 
			   System.out.println("t는 r을 포함합니다.");
		   if(t.contains(s)) 
			   System.out.println("t는 s를 포함합니다.");

//		    t는 s를 포함하지는 않음->11이라 넘어감.
		   else
			   System.out.println("t는 s를 포함하지않는다.");
	
	}
}