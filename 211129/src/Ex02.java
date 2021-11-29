import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {
    Ex02() {
        List<String> slist = new ArrayList();
        slist.add("TOM");
        slist.add("BOY");
        slist.add("ROBOT");

        Iterator<String> itr = slist.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();
        for (String s:slist) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {

        new Ex02();
    }
}
