class PA{ //부모 클래스

}
// 자식클래스 C1,C2
class C1 extends PA{
    public String toString() {
        return "C1";
    }
}
class C2 extends PA{
    public String toString() {
        return "C2";
    }
}
public class Ex01 {

    public static void main(String[] args) {
        //부모가 자식담기: 다형성의 기본문법
        PA p1 = new C1();
        PA p2 = new C2();
        System.out.println(p1);
        System.out.println(p2);
    }
}
