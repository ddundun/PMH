public interface Printable { //상속받아쓰는애가 재정의해야하는 규칙ㄴ
    int PAPER_WIDTH = 70;
    int PAPER_HEIGHT = 120;

    public void print(String doc); //{ 몸체 }가없음

    default void printCMYK(String doc){
        System.out.println("컬러 프린트");
        print(doc);
    }
    static void staticprint(String doc){
        System.out.println("스태틱은 객체생성하지않고");
        System.out.println(doc);
    }
}
