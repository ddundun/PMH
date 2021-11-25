import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자 입력시 형변환해서 출력 >>");

        //33+10 = 3310 -> 43

        //java로 웹프로그래밍 jsp, spring
        String line = scan.nextLine();

        int myint = Integer.parseInt(line)+10; //parseInt : public static
//        Interger myint = Integer.parseInt(line)+10; //parseInt : public static
        System.out.println("int 형 = " + myint);

        String myint5 = Integer.toString(myint);
//        String myint5 =
        System.out.println("String 형 = " + myint5);
    }
}
