class PPA {
    public static  int count = 10;
}
class CPA extends PPA {
    public void doA() {
        System.out.println("count = "+count);
    }
}
public class Ex03 {
    public static void main(String[] args) {
        new CPA().doA(); //공간이름안ㄴ만들고 doA바로 호출
        System.out.println("static으로 접근");
        System.out.println(PPA.count); //그냥가져다쓰는게편함 이런식으로..
    }

}
