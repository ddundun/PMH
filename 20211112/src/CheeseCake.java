public class CheeseCake extends Cake{
    public void yummy() {
        super.yummy(); //이거써야 부모꺼쓸수있음ㅎ
        System.out.println("Yummy CheeseCake");
    }

    public static void main(String[] args) {
        Cake c1= new CheeseCake();
        CheeseCake c2 = new CheeseCake();

        c1.yummy();
        c2.yummy();
    }
}
