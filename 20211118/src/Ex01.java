/*
다형성 : 자식클래스는 부모클래스 참조변수로 참조할 수 있다.

*/
class Car {
    String brand;
    String name;

//    public Car(String brand, String name) {
//        this.brand = brand;
//        this.name = name;
//    }

    public void doDrive(){
        System.out.println(brand+"자동차의"+name+"운전 중...");
    }
}
class KiaCar extends Car {
//    public KiaCar(String brand, String name) {
//        super(brand, name);
//    }
 

    @Override //메서드 재정의
    public void doDrive() {
        System.out.println("기아자동차");
        super.doDrive();
    }
}

class HynCar extends Car {
//    public HynCar(String brand, String name) {
//        super(brand, name);
//    }

    @Override
    public void doDrive() {
        System.out.println("현대자동차");
        super.doDrive();
    }
}
public class Ex01 {
    public static void main(String[] args) {
        Car cars[] = new Car[10];
        cars[0] = new KiaCar();
        cars[1] = new HynCar();

        cars[2] = new KiaCar();
        cars[3] = new HynCar();

        cars[0].brand = "기아";
        cars[0].name ="k3";
        cars[0].doDrive();
        
        System.out.println();

        cars[1].brand = "현대";
        cars[1].name ="아반떼";
        cars[1].doDrive();

    }

}
