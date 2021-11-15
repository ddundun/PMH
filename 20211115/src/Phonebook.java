

import java.util.Scanner;
class Phone {
    private String name;
    private String tel;

    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
    public String getName() {
        return name;
    }
//    public void setName(String name) {
//        this.name = name;
//    }
    public String getTel() {
        return tel;
    }
//    public void setTel(int tel) {
//        this.tel = tel;
//    }
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

            scan.nextLine(); //입력버퍼에 있는 엔터키 지우기...

            for (int i=0; i<arrsize; i++){ //입력완성
                System.out.println("이름과 전화번호(이름과 번호는 입력)");
                String temp = scan.nextLine();
                String name_tel[] = temp.split("\\s"); //띄어쓰기 기준으로 자르는법
//                System.out.println(name_tel[0]); //이름
//                System.out.println(name_tel[1]); //전화번호
                //이 nametel[0], [1] phone에담아야함
                phones[i] = new Phone(name_tel[0],name_tel[1]);
//                Integer.parseInt(name_tel[1])쓸필요x
            }
            System.out.println("저장이 완료되었습니다.");
            while(true) {
                System.out.println("검색할 이름? >>");
                String sel = scan.nextLine();
                if (sel.equals("그만")) {//string비교연산자 equals사용해야함 ==쓰면안됨..
                    System.out.println("종료되었습니다.");
                    break; //그만치기전까지 계속 돌아감
                }

                int success = 0;
                for (Phone temp:phones) {
                    if (temp.getName().equals(sel)) {//입력한 값과 같으면
                        System.out.println("검색 성공");
                        success =1;
//                        System.out.println(temp.getName());
//                        System.out.println(temp.getTel());
                        System.out.println(temp.getName()+","+temp.getTel());
                        break;
                    }
//                    else {
//                        System.out.println("검색 실패");
//                    }
                }
                if (success ==0) {
                    System.out.println("검색이 실패하였습니다.");
                }
            }
        }

    public static void main(String[] args) {
            new Phonebook();

    }
    }

