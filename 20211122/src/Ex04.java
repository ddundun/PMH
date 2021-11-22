public class Ex04 {
    public static void main(String[] args) {
        Rectangle r1 =new Rectangle(1,1,9,9);
        Rectangle r2= null;
        try {
            r2= (Rectangle)r1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("r1 출력 시작");
        System.out.println("r1.lr.x"+r1.lowerRight);
        System.out.println("r1.ul.x"+r1.upperLeft);
        r2.lowerRight.setXpos(30); //r2를바꿈

        System.out.println("r2.lr값 변경"); //얕은복사시엔 r2값변경했지만 r1도변경
//        깊은복사하니까 따로따로 잘적용됨
        System.out.println("r1.lr.x"+r1.lowerRight);
        System.out.println("r1.ul.x"+r1.upperLeft);

        System.out.println("r2 출력시작");
        System.out.println("r2.lr"+r2.lowerRight);
        System.out.println("r2.ul"+r2.upperLeft);
    }
}
