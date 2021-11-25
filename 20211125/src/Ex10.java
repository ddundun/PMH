import java.util.Arrays;

// 인터페이스 comparable 상속받아서 compareto 메서드 재정의 -> arrays.sort()함수 사용 가능
// 인터페이스 clonable 상속받아서 clone 메서드를 재정의하면 ~

class Person implements Comparable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
    @Override
    public int compareTo(Object obj) { //나이로 비교
//        return  this.age - ((Person) obj).age;
//        return  ((Person) obj).age- this.age;
        return this.name.length() - ((Person) obj).name.length();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Ex10 {
    public static void main(String[] args) {
        Person people[] = new Person[3];

        people[0] = new Person("aa111", 20);
        people[1] = new Person("bbb2222", 10);
        people[2] = new Person("cccc", 5);

        Arrays.sort(people);
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
