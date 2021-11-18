import netscape.javascript.JSUtil;

import java.util.Scanner;

public class Dictionary {
    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love", "baby", "money", "future","hope"};

    public static String kor2Eng(String word) { /*검색 코드 작성*/
        for(int i =0; i<kor.length; i++) { //사전안에있으면 여기안에있음
            if(kor[i].equals(word)) //kor[i]=word
                return word+"는(은)"+eng[i]+"입니다.";
        } //사전안에 내용없으면 for구문탈출
        return word+"는(은) 사전에 없습니다. ";}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("한영단어검색 프로그램입니다.");
            System.out.println("한글 단어?");
            String word = scan.nextLine();
            System.out.println("word = "+word);

            if(word.equals("그만"))
                break;
            String result = kor2Eng(word);
            System.out.println(result);
        }
    }
}