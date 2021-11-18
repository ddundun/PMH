import sun.security.rsa.RSAUtil;

public class LPrinterDriver implements Printable{
    @Override
    public void print(String doc) {
        System.out.println("From LG");
        System.out.println(doc);

    }
}
