

import java.util.Scanner;
class Phone {
    private String name;
    private int tel;

    public Phone(String name) {
        this.name = name;
    }
}
//자바 파일명과 클래스명이 동일해야하는데 public으로 선언되어있어,..
public class Phonebook {
        Phonebook() {
            //배열의 선언
            Scanner scan =new Scanner(System.in);

            System.out.println("인원 수 >>");
            int arrsize = scan.nextInt();
            Phone phones[] = new Phone[arrsize];
            System.out.println("phones.length ="+phones.length);

            for (int i=0; i<arrsize; i++){
                System.out.println("이름과 전화번호(이름과 번호는 입력)");
                String temp = scan.nextLine();
                String name_tel[] = temp.split(" ");
                System.out.println(name_tel[0]);
                System.out.println(name_tel[1]);
            }
        }

    public static void main(String[] args) {
            new Phonebook();

    }
    }

