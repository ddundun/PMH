import java.util.Arrays;
import java.util.Comparator;

//cloneable - > clone, comparable -> compareTo

//class Person implements Comparable{
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public int compareTo(Object o) {
//        return this.age - ((Person)o).age;
//    }
}
public class Ex01 {

    public static void main(String[] args) {
        int arry[] = {5,2,3,1,4}; //기본형타입

        for (int temp: arry) {
            System.out.print(temp+" ");
        }
        Arrays.sort(arry); //기본형타입은 별다른 적용필요없이 잘 됨
        //but, 객체형타입은 뭔가 해줘야함

        System.out.println();

        for (int temp:arry) {
            System.out.print(temp+" ");
        }
        Person parry[] = new Person[3];
        parry[0] = new Person("a",10);
        parry[1] = new Person("bb",20);
        parry[2] = new Person("ccc",5);

        System.out.println();
        for (Person temp: parry) {
            System.out.println("temp ="+temp);
        }
        Arrays.sort(parry); //-> compareTo재정의안해주면 에러뜸 ..

        for (Person temp: parry) {
            System.out.println("temp ="+temp);
        }

//        Arrays.sort(,comparable)
    }
}
