import java.util.Scanner;

public class Ex04_1 {

    public static void main(String[] args) {
//      "one4seveneight" -> 1478
        String numbers1[] = {"one","two","three","four","five","six","seven","eight","nine"};
        String numbers2[] = {"1","2","3","4","5","6","7","8","9"};


        Scanner scan = new Scanner(System.in);

        System.out.println("글자입력 >>");
        String inputString = scan.nextLine();
        for (int i = 0; i<numbers1.length ; i++) {
            inputString = inputString.replaceAll(numbers2[i],numbers1[i]);
//            System.out.println("inputString = "+inputString);
//        replaceAll(a,b): 모든 a를 b로 바꿔라
        }
        System.out.println("inputString = "+inputString);
    }
}
