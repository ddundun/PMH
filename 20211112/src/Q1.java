class Box {
    public void simpleWrap() {
        System.out.println("Simple Wrapping");
    }

}

class PaperBox extends Box {
    public PaperBox() {
    }

    @Override
    public void simpleWrap() {
        super.simpleWrap();
    }

    public void paperWrap() {
        System.out.println("Paper Wrapping");
    }
}

class GoldPaperBox extends PaperBox {
    public GoldPaperBox() {
    }

    public void goldWrap() {
        System.out.println("Gold Wrapping");
    }
    public static void main(String[] args) {
        Box box1 = new Box();
        PaperBox box2 = new PaperBox();
        GoldPaperBox box3 = new GoldPaperBox();

        wrapBox(box1);
        wrapBox(box2);
        wrapBox(box3);


    }

    private static void wrapBox(GoldPaperBox box3) {

    }

}

