import java.io.FileWriter;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("프로그램상태안좋아요");
            System.out.println("다시만드세용");

            try {
                FileWriter fileWriter = new FileWriter("test.txt");
                fileWriter.write("프로그램상태가 안좋아용");
                fileWriter.close(); //파일 열어둔 것 닫기
            }catch (IOException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
        System.out.println("프로그램종료합니다.");
    }
}
