/*
* 컬렉션과 제네릭을 같이쓰면됨
* python// list 0숫자형 1 문자형 2, set, dict..
* java //  list<string,integer ...?>,set,map
* */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<String> slist = new LinkedList<>();
        List<Integer> ilist = new ArrayList<>();

        slist.add("문자열1");
        slist.add("문자열2");
        slist.add("문자열3");

        ilist.add(1); ilist.add(2); ilist.add(3);

        System.out.println(slist);
        System.out.println(ilist);

    }
}

