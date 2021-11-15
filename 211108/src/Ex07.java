class Data{
    public void doA(int a) {
        System.out.println("doA = " +a);
    }
}
public class Ex07 {
    public static void main(String[] args) {
       /*
        System.out.println("java.length = "+"java".length()); // ->temp이용안하고 이방식 사용해도 되긴함!
        String [] sr = new String[7];
        sr[0] = new String("Java");
        sr[1] = new String("System");
        sr[2] = new String("Compiler");
        sr[3] = new String("Park");
        sr[4] = new String("Tree");
        sr[5] = new String("Dinner");
        sr[6] = new String("Brunch Cafe");

        int cnum=0;
        for(String temp:sr) {
            cnum+= temp.length();
        }
        System.out.println("cnum= "+cnum);
        String ar[] = new String[1];
        System.out.println(ar[0].length()); //ar0은 null임 , 당연히 길이 안ㄴ나옴
        */
        Data datas[] = new Data[2]; // 데이터공간 크기 두개만듬 (값안ㄴ넣고만듬)
        // data[0],data[1] 둘다 null
        datas[0] = new Data();

        datas[0].doA(0);
        datas[1].doA(1); // null.doA - > nullpointexception;
        //datas[0]은 선언해줌 = null아니고 data란 클래스생성

    }
}
