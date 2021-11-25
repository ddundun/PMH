import java.lang.*; // 생략가능

class Box implements Cloneable {
    private String element;

    public Box(String element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Box{" +
                "element='" + element + '\'' +
                '}';
    }

    @Override //클론메서드
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getElement() {
        return element;
    }
}

public class Ex01 {

//    예외처리의 방법: try catch finally(직접처리 - 예외가 있더라도), throws Exception (전달)
//    new throw Exception() : 예외 발생시키기
    public static void main(String[] args) throws Exception {
        Box box1 = new Box("사과");
//        Box box2 = box1; //얕은복사
        Box box2 = new Box (box1.getElement());
//        = Box box2 = (Box)box1.clone();
        box1.setElement("바나나");

        System.out.println(box1);
        System.out.println(box2);
    }
}