public class Ex03 {
    public static void main(String[] args) {
        Point p1 = new Point(3,5);
        Point p2= p1; //참조변수 복사...
        Point p3 = null;

        try {
            p3 = (Point) p1.clone(); //Point p3이 try구문안에있으면 밑에서사용불가.
//            그래서 p3널값주고 여기서 선언?

        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("p1 시작");
        System.out.println(p1);
        p2.setXpos(6);
        System.out.println(p1); //p2를바꿨지만 p1출력해도 바껴있음

        System.out.println("p3 시작");
        System.out.println(p3);
        p1.setYpos(20);
        System.out.println(p3);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }
}
