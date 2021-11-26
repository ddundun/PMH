class Box<T> {
    private T obj;

    public Box(T obj) {
        this.obj = obj;
    }

    public Box() {

    }

    public T get() {
        return obj;
    }

    @Override
    public String toString() {
        return "Box{" + "obj=" + obj + '}';
    }
}

public class Ex04 {
    public static void main(String[] args) {
//        Box aBox = new Box(new Apple("사과"));
//        Box bBox = new Box(new Banana("바나나"));


        //이런식으로 가지고나올떄 형변환 꼭 필요
//        Apple apple = (Apple) aBox.get();
//        Banana banana = (Banana) bBox.get();

        Box<Apple> aBox = new Box<>();
        Box<Banana> bBox = new Box<>();
        Apple apple = aBox.get();
        Banana banana = bBox.get();
        System.out.println(apple);
        System.out.println(banana);
    }
}
