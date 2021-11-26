import java.util.Random;

public class Ex02 {

    public static void main(String[] args) {
        Random ran = new Random(); //-> seed값 비어있다면 System.currentTimeMillis()생략되어있음. 초마다바뀜
        for (int i = 0; i<7; i++){
            System.out.print(ran.nextInt(1000)+" ");
        }
    }
}
