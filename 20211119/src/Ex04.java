class MyException extends Exception {
    MyException() {
        super("나만의 예외..");
    }
}

public class Ex04 {
    public static void main(String[] args) throws MyException {
        // a 값이 30 이상이면 예외가 발생해야함.
        int a =30;

        if (a>=30)
            throw new MyException(); //throw:예외 강제발생


    }
}

