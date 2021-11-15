import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("이름을 성과 이름을 띄어서 영어로 입력>>");
        String inputString = scan.nextLine();

        System.out.println("inputString = "+inputString);
        String ar[] = inputString.split(" ");
//        for(String a: ar) { // string a in 어쩌구.,.?
////
//            System.out.println("a= "+a);
//        }
        System.out.println("성 = " +ar[0]);
        System.out.println("이름 = " +ar[1]);

//        int blinkNumber= inputString.charAt(' ');
//        System.out.println("blinkNumber = " +blinkNumber);
    }
}

