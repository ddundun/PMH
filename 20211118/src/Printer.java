// 부모 클래스 ... 참조 변수로 활용 가능
// 다형성
//
//->(); 람다문법..
//
// 상속 받았으면 상속받은 인터페이스 안에 메서드 재정의..규칙

public class Printer implements Printable { // 인터페이스는 extends대신 implements

    @Override
    public void print(String doc) {
        System.out.println(doc+" 재정의(override)");

    }

    public static void main(String[] args) {
        Printable prn = new Printer();
        prn.print("기본 생성 방법");
        
        
//        Printable prn2 = (aa) ->{
//            System.out.println("방금만든 람다");
//        };

//        Printable prn3= new Printable() { //자바옛날버전에서 쓰던방법
//            @Override
//            public void print(String doc) { //이게 람다로바뀜~
//            }
//        };

    }
}
