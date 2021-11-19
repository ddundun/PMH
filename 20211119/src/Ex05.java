import java.io.File;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = null;
        try {
            scan = new Scanner(new File("a.txt"));
            String line = scan.nextLine(); //한줄 읽어와서 line이라ㅏ는 변수에담음
            System.out.println("line = "+line);
            line = scan.nextLine(); //여기서 에러발생 . a.txt파일에서 둘째줄 셋째줄만들어주면 에러발생x
            System.out.println("line = "+line);
            line = scan.nextLine();
            System.out.println("line = "+line);
            line = scan.nextLine();
            System.out.println("line = "+line);

        } catch (Exception e) {
            System.out.println(e.getMessage()); //어떤에러인지나옴 ->no line found
            System.out.println("예외");
        } finally {
            System.out.println("파이널");
            scan.close(); // ->
        }
    }
}
