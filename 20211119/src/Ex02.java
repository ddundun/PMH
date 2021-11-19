class UCls {} //부모객체
class DCls extends UCls {} //자식객체
public class Ex02 {
    public static void main(String[] args) {
//        UCls uCls = new UCls();
//        DCls dCls = (DCls) uCls;

        System.out.println("진행");

        DCls dCls1 = new DCls();
        UCls uCls1 = (UCls) dCls1;

        System.out.println("완료");
        //형변환..? 
        //부모는 자식참조가능 , 자식은 부모참조불가능
    }
}
