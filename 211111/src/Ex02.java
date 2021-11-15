/*
*   생략된 표현들   *
*  import java.lang.*;
*  toString
*  super();
*  super. 부모생성자의 ~
*  this. 이생서자의~
*  
*   기본 생성자도 생략되어져 있지만, 다른 생성자 선언 시 기본생성자 생략 불가
* */

class paA {
    String name;
    int pa;
    public paA(){ //기본생성ㅇ자
        System.out.println("부모생성자");
    }
    public  paA(String name, int pa) { //다른생성자
        this.name = name;
        this.pa = pa;
    }
    
}
class CaA extends paA {
    int ca;
    int cb;
    CaA(String n, int p, int a, int c) {
        super(n,p); //생략된 표현, 이자리 말고 다른자리에 오면 ERROR
//        super : 상위 생성자 호출
//        name = n;
//        pa = p;
        this.ca = a;
        cb =c;
    }

    @Override
    public String toString() {
        return "CaA{" +
                "name='" + name + '\'' +
                ", pa=" + pa +
                ", ca=" + ca +
                ", cb=" + cb +
                '}';
    }
}
public class Ex02 {
    public static void main(String[] args) {
        CaA caA  = new CaA("Name",10,20,30);
        System.out.println(caA);
    }
}
