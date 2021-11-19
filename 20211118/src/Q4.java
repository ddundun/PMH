import java.util.Scanner;

class Add {
    private int a;
    private int b;
    void setValue(int a, int b) { this.a = a; this.b = b; }
    int calculate() { return a+b; }
}
class Sub {
    private int a;
    private int b;
    void setValue(int a, int b) { this.a = a; this.b = b; }
    int calculate() { return a-b; }
}
class Mul {
    private int a;
    private int b;
    void setValue(int a, int b) { this.a = a; this.b = b; }
    int calculate() { return a*b; }
}
class Div {
    private int a;
    private int b;
    void setValue(int a, int b) { this.a = a; this.b = b; }
    int calculate() { return a/b; }
}
public class Q4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("두 정수와 연산자를 입력하시오.");

    }
}
