/*
* 생략 가능
* 1. import java.lang.*
* 2. super()
* 3. toString()
* 4. this. super. 생략가능
* 5. extends Object -> java에서 최상위 클래스 (모든 클래스의 최상위클래스)
* 6. @override
* */

// 기본 생성자 호출은 무조건하기때문에 부모클래스가 선언되어져있어야 한다.

class MobilePhone extends Object{
    int number;
    public MobilePhone(){//이게 기본생성자}
    }
    public MobilePhone(int number) { //매개변수가 있는 생성자함수 (!=기본생성자)
        this.number = number;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "number=" + number +
                '}';
    }

    public void answer() {
        System.out.println("Hi from " +number);
    }
}

public class SmartPhone extends MobilePhone {
    private String androidVer;

//    public SmartPhone() {
//    }

    public SmartPhone(int number,String androidVer) {
        super(number);
        this.androidVer = androidVer;
    }

    public void playApp(){
        System.out.println("안드로이드 버전 :" +androidVer);
    }
    public static void main(String[] args) {

        MobilePhone mp =new MobilePhone(123); //모바일폰객체
        System.out.println("mp: "+mp);
        mp.answer();

        System.out.println();

        SmartPhone sp = new SmartPhone(456,"9버전"); //스마트폰 객체
        System.out.println("sp: "+sp);
        sp.answer();
        sp.playApp();

        System.out.println();

        MobilePhone mps = new SmartPhone(500,"10버전");
        // playapp은 smartphone에 들어있어서 사용불가/ mobilephone안에 들어있는 것들만 사용가능
        // 자식객체는 부모 클래스에 담을수있음..??
        // 부모참조변수는 자식객체를 참조할 수 있다. ->다형성 (특성)
        // Object MobilePhone SmartPhone
        mps.answer();
        System.out.println("mps: "+mps);

        System.out.println();

        Object a = new MobilePhone(1);
        Object b = new SmartPhone(600,"11");
        System.out.println("b: "+b);

        ((MobilePhone)a).answer(); // a.answer() -> error/
        // a를 mobilephone으로 형변환하면 answer사용가능.
        SmartPhone ss = (SmartPhone)b;
//        ((SmartPhone)b).playApp(); 위에랑 동일
        ss.playApp();
    }
}
