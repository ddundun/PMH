class Car { //부모 class
    String name;
    public void tellName() {
        System.out.println("name = "+name);
    }

}
public class HCar extends Car {

    String brand;
    public HCar() {
        name = "아반떼";
        brand = "현대";
    }
    public void tellInfo() {
//        System.out.println("name" +name);
        tellName();
        System.out.println("brand" +brand);

    }

    public static void main(String[] args) {
        HCar hCar = new HCar();
        hCar.tellInfo();
    }
}