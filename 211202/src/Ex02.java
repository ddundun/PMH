//interface Animal {
//    public static final int DOG = 1;
//    int CAT = 2;
//}
//
//interface PERSON {
//    int MAN = 1;
//    int WOMAN = 2;
//}
enum Animal {
    DOG, CAT;
}

enum PERSON {
    MAN,WOMAN;


    @Override
    public String toString() {
//        return super.toString();
        return "MAN";
    }

}


public class Ex02 {
    public static void main(String[] args) {
        System.out.println(PERSON.MAN);
        who(PERSON.MAN); //1
//        who(Animal.DOG); //1 , but dog인데 남성,,?
    }

    private static void who(PERSON man) {
        switch (man) {
            case MAN:
                System.out.println("남성손님입니다.");
                break;
            case WOMAN:
                System.out.println("여성손님입니다.");
                break;
        }
    }
}
