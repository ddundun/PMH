class Car {
    int gasoline;

    Car(int ga) {
        this.gasoline =ga;
    }
}
class HybridCar extends Car {
    int electric;

    HybridCar(int elc, int ga) {
        super(ga);
        this.electric =elc;

    }
}
class HybridWaterCar extends HybridCar {
    int water;
// 생성자는 생략 가능하지만 다른 생성자 선언 시 생략 불가
    HybridWaterCar(int wa,int elc, int ga) {
//        this.electric =elc;
//        this.water = water;
        super(elc,ga);
        this.water= wa;
    }

    public void showCurrent() {
        System.out.println("잔여가솔린:"+gasoline);
        System.out.println("잔여전기:"+electric);
        System.out.println("잔여물:"+water);

    }
}
public class page323 {
    public static void main(String[] args) {
        HybridWaterCar hwc= new HybridWaterCar(10,5,3);
        hwc.showCurrent();
    }
}
