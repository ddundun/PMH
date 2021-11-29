import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Row implements Comparable<Row> {
    private String name;
    private int KOR;
    private int ENG;
    private int MATH;
    private int TOTAL;

    public Row(String name, int KOR, int ENG, int MATH) {
        this.name = name;
        this.KOR = KOR;
        this.ENG = ENG;
        this.MATH = MATH;
        this.TOTAL = KOR+ENG+MATH;
    }

    @Override
    public String toString() {
        return "Row{" +
                "name='" + name + '\'' +
                ", KOR=" + KOR +
                ", ENG=" + ENG +
                ", MATH=" + MATH +
                ", TOTAL=" + TOTAL +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Row row = (Row) o;
        return     this.KOR == row.KOR
                && this.ENG == row.ENG
                && this.MATH == row.MATH
                && this.TOTAL == row.TOTAL;//                && Object.e
    }


    @Override
    public int compareTo(Row o) {
        return this.TOTAL- o.TOTAL;
    }
}

public class Ex03 {
    public static void main(String[] args) {



        List<Row> a1 = new ArrayList<>();
        a1.add(new Row("aa",100,80,70));
        a1.add(new Row("bbb",90,20,90));
        a1.add(new Row("cccc",70,50,70));

        //list<Row>

        // iterator , enhanved for, 변수명출력
        System.out.println(a1); //변수명출력

        //합계.. 정렬 쉽게 하고싶음
        //for total al..comparable,,상속받아서 interface..

        Collections.sort(a1);

        System.out.println(a1);

    }
}
