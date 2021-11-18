public class Ex02 {
    public static void main(String[] args) {
        Printable prn1 = new SPrinterDriver();
        prn1.printCMYK("삼성");

        System.out.println();

        Printable prn2 = new LPrinterDriver();
        prn2.print("LG");

        System.out.println(Printable.PAPER_WIDTH);
        System.out.println(Printable.PAPER_HEIGHT);

        System.out.println();
        Printable.staticprint("출력"); //참조변수없이 바로 출력가능
    }
}
