import java.io.FileWriter;
import java.io.IOException;

class AA {
    public AA() throws IOException {
        System.out.println("AA 생성자 호출시 IOException 발생가능 명시");
    }
}

public class Ex03 {
    public static void md1() {
        //try catch문으로 감싸기, throws Exception 예외 다른 곳으로 처리하라고 넘기기 -> 에러처리방법
        try {
            md2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void md2() throws Exception /*위에 md2첨나온곳으로가라? */ {
        //try catch문으로 감싸기, throws Exception 예외 다른 곳으로 처리하라고 넘기기 -> 에러처리방법
        FileWriter writer = new FileWriter("a.txt");
        writer.write("글을 씁니다");
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        md1();
        new AA();
    }
}
