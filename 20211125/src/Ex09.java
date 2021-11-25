import java.util.Arrays;

class INum {
    private int num;

    public INum(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
//        재정의 전: if this ==o return true; (공간)
        if (this.num ==((INum)o).num) {return true;}
        else
            return false;
    }
}

public class Ex09 {
    public static void main(String[] args) {
        INum[] inums1 = new INum[3];
        INum[] inums2 = new INum[3];

//        True
//        inums1[0] = inums2[0] = new INum(3); //inums1,2의 0번째에 3넣기
//        inums1[1] = inums2[1] = new INum(4);
//        inums1[2] = inums2[2] = new INum(5);

//        재정의전 -> False 재정의 후 -> True
        inums1[0] = new INum(3);  inums2[0] = new INum(3);
        inums1[1] = new INum(4);  inums2[1] = new INum(4);
        inums1[2] = new INum(5);  inums2[2] = new INum(5);

        System.out.println(Arrays.equals(inums1,inums2));
    }

}
