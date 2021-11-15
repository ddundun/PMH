class Box {
    private String conts;

    //생성자 toString
    //alt insert

    public Box(String conts) {
        this.conts = conts;
    }

    @Override
    public String toString() {
        return "Box{" +
                "conts='" + conts + '\'' +
                '}';
    }
}

public class Ex06 {
    public static void main(String[] args) {

        Box[] boxs = new Box [3];
//    = Box boxs[] = new Box [3];

        for (Box temp:boxs) {
            System.out.println("temp = " + temp);
        }
        boxs[0] = new Box ("사과");
        boxs[1] = new Box ("고구마");
        boxs[2] = new Box ("감자");

        for (Box temp:boxs) {
            System.out.println("temp = " + temp);
        }

        //temp = temp.toString
        //tostring 주석처리하면 -> 주소값만뜸!

    }
}
