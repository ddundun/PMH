class Car1 {
    int gasolingGauge;

    public Car1(int g) { //다른생성자
        this.gasolingGauge = g;
    }
}
class HybridCar extends Car1 {
    int electricGauge;

    HybridCar(int g, int e) {
        super(g);
        //생략된 표현, 이자리 말고 다른자리에 오면 ERROR
//        super : 상위 생성자 호출
//        name = n;
//        pa = p;
        this.electricGauge = e;

    }
}
    class HYbridWaterCar extends HybridCar {
        int waterGauge;

        HYbridWaterCar(int g, int e, int w) {
            super(g, e);
            this.waterGauge = w;
        }

        public void showCurrentGauge(int g, int e, int w) {
            System.out.println("잔여 가솔린 " + gasolingGauge);
            System.out.println("잔여 전기량 " + electricGauge);
            System.out.println("잔여 워터량 " + waterGauge);
        }
    }


public class Q1 {
    public static void main(String[] args) {
//        new HYbridWaterCar().showCurrentGauge(10,20,30); //공간이름안ㄴ만들고 doA바로 호출
//        System.out.println(HYbridWaterCar.); //그냥가져다쓰는게편함 이런식으로..

    }
}




