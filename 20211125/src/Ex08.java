import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        //객체변수... 배열변수.. 참조...
        double[] arOrg = {1.1,2.2,3.3,4.4,5.5};

//        double[] arcpy1 = arOrg;
//        arcpy1[0] =3.3; -> 둘다바뀜..
        
//        이렇게 복사하면 arcpy1만바뀜 arrays.copyof(dd,ㅂ); ㅂ까지
        double[] arcpy1 = Arrays.copyOf(arOrg,6);

        if (arOrg ==arcpy1) { //string의 equals와 동일
            System.out.println("같다");}
        else {
            System.out.println("다르다");
        }
//        arcpy1[0] =3.3;
//
//        for (double elem: arOrg){
//            System.out.print(elem+"\t");}
//        System.out.println();
//
//        for (double elem: arcpy1){
//            System.out.print(elem+"\t");}
//        System.out.println();
    }


}
