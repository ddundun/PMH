class AA{}
public class Ex05 {

    public static void main(String[] args) {
        int arr[] = new int[5];
        for (int temp :arr) { //arr의 temp 하나씩 가지고나옴
            //= for i in arr python
            System.out.println("temp = "+temp);

        }
        System.out.println("arr.length= "+arr.length);

        String sarr[] = new String[5];
        for (String temp :sarr) { //arr의 temp 하나씩 가지고나옴
            //= for i in arr python
            System.out.println("temp = "+temp);

        }
        System.out.println("sarr.length= "+sarr.length);


        AA sAA[] = new AA[5]; //AA클래스는 빈객체긴하지만 만들수있음
        for (AA temp :sAA) { //arr의 temp 하나씩 가지고나옴
            //= for i in arr python
            System.out.println("temp = "+temp);

        }
        System.out.println("sAA.length= "+sAA.length);


    }
}
