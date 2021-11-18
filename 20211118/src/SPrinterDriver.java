public class SPrinterDriver implements Printable {
    @Override //재정의
    public void print(String doc) {
        System.out.println("From Samsung");
        System.out.println(doc);

    }
}
