public class Ex02 {
    public static void ShowData(Object obj) {
        System.out.println(obj);
    }
/*  python 모든 자료형 타입은 래퍼 클래스이다.
 *  a = 10
 */


//    1.79...10**308(제곱)
    public static void main(String[] args) {
        Integer iinst = new Integer(3);
        ShowData(iinst);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
//        static변수기때문에 사용 ok(min,max value)


        Double dinst = new Double(7.15);
        ShowData(dinst);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.SIZE);
    }
}

