import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("입력>>");

        String s1= scan.nextLine();

        String ar[] = s1.split("\\.");
        System.out.println("출력");
        System.out.println("파일명 "+ar[0]);
        System.out.println("확장자 "+ar[1]);
    }

}
