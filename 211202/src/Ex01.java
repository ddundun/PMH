import javafx.scene.layout.CornerRadii;

import java.util.*;

/*
 * 컬렉션 프레임워크 ..
 * list<Person> 순서가 있는 자료형 타입으로 Person 객체를 추가하거나 뺄 수 있다.
 * Set<String> 순서가 없고 중복 허용이 되지 않는 자료형 타입
 * Map<Key,Value> 한쌍의 객체를 넣을 수 있는 자료형 타입
 *
 * Comparable 상속 받아서 compareTo 메서드 재정의해서 정렬
 *  */
class Person implements Comparable<Person> {
    public int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String
    toString() {
        return "Person{" + "age=" + age + ", name='" + name + '\'' + '}';
    }


    @Override
    public int compareTo(Person o) {
        return o.age - this.age;
    }
}

class mycomparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o2.age - o1.age;
    }
}

public class Ex01 {
    public static void main(String[] args) {
//        Person p1 = new Person(20,"홍길동");
//        System.out.println(p1);
//        List<Person> list = new ArrayList<>();
//        list.add(p1);
//        System.out.println(list);

        List<Person> list = Arrays.asList(new Person(20, "홍길동"),
                new Person(40, "홍홍홍"), new Person(33, "삼삼이"));
//        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));


//        Collections.sort(list); //나이순으로 정렬

        // comparator 다른방식으로사용하는법 : (list, 함수())
//        Collections.sort(list, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o2.age - o1.age;
//            }
//        });  // 다른방식1번째방법
//        Collections.sort(list, new mycomparator()); //다른방식 2번째방법
//        Collections.sort(list,((o1, o2) -> o2.age - o1.age) ); //다른방식 3번쨰 방법

        mycomparator mc = new mycomparator(); //다른방식 ...?
        Collections.sort(list,mc);

        System.out.println();

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

    }

}
