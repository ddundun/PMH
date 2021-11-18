import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 프로그램이 종료되지 않도록 예외를 처리.
        try {
            System.out.println("a = ?");
            int a = scan.nextInt();

            System.out.println("b = ?");
            int b = scan.nextInt();

            System.out.println("a/b = ? " + a / b);
            System.out.println("완료");
        } catch (Exception ae ) {
            ae.printStackTrace(); //->에러구문출력
            System.out.println("모든예외");
//        }
//        catch (InputMismatchException Ie ) {
//            Ie.printStackTrace(); //->에러구문출력
//            System.out.println("문자열 넣기예외발생");
//        }
        }
        System.out.println("Bye"); //try catch없으면 bye안뜸

    }
}