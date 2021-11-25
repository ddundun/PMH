import java.util.Random;

public class Ex06 {
    public static void main(String[] args) {
        System.out.println();
//        Random ran1 = new Random(System.out.println(System.currentTimeMillis()); ->써도되고안써도되고
        Random ran1 = new Random();
        for (int i = 0; i < 7; i++)
            System.out.println(ran1.nextInt(1000));

//      일정한 랜덤패턴 반복 -> seed값 때문
//        Random ran2 = new Random(12);
//        for (int i =0; i<7; i++)
//            System.out.println(ran2.nextInt(1000));

    }
}
