import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
//      "one4seveneight" -> 1478
        String numbers[] = {"one","two","three","four","five","six","seven","eight","nine"};
        Scanner scan = new Scanner(System.in);

        System.out.println("글자입력 >>");
        String inputString = scan.nextLine();
        for (int i = 0; i<numbers.length ; i++) {
            inputString = inputString.replaceAll(numbers[i], (i + 1) + "");
//            문자열로바꾸는방법 :string.valueof(i+1)
//            System.out.println("inputString = "+inputString);
//        replaceAll(a,b): 모든 a를 b로 바꿔라s
        }
        for (int i = 0; i<numbers.length ; i++) {
            inputString = inputString.replaceAll(String.valueOf(i + 1) ,numbers[i]);
//            문자열로바꾸는방법 :string.valueof(i+1)
//            System.out.println("inputString = "+inputString);
//        replaceAll(a,b): 모든 a를 b로 바꿔라
        } // 이거쓰면 거꾸로,,!
        System.out.println("inputString = "+inputString);
    }
}
