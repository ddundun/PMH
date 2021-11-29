import java.sql.Array;
import java.util.*;

public class Ex06 {
    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(5);
//        list.add(4);

        List<Integer> list = Arrays.asList(1,2,5,3,4);
//        list = new ArrayList<>(list); 원래이거있어야 에러x 근데없어도되네?

        List<String > slist = Arrays.asList("aa","cc","dd","bb","ee");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        System.out.println();
        System.out.println(slist);
        Collections.sort(slist);
        System.out.println(slist);


    }
}
