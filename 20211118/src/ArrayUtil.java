public class ArrayUtil {
    public static int[] concat(int[] a, int[] b) {
        /* 배열 a와 b를 연결한 새로운 배열 리턴 */
        int temp[] = new int[a.length+b.length]; //길이선언
        int index= 0;
        for(int atemp:a)
            temp[index++] = atemp; //index +=1 (=index++)
        for(int btemp:b)
            temp[index++] = btemp;
        return temp;
    }
    public static void print(int[] a) { //static이라 .머시기로 사용가능, static아니면 객체생성해야함
        /* 배열 a 출력 */
        System.out.println("[");
        for (int temp:a) //향상된for구문
            System.out.println(temp+" ");
        System.out.println("]");
    }
}

