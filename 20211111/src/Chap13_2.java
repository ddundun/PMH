public class Chap13_2 {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
//        charr(arr); //change arr
        for (int i =0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length;j++) {
                System.out.println(arr[i][j]+"");
            }
            System.out.println();
        }
        charr(arr);
        System.out.println("변경 후");
        for (int i =0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length;j++) {
                System.out.println(arr[i][j]+"");
            }
            System.out.println();
        }
    }

    private static void charr(int[][] arr) {
        int brr[] = arr[0]; //brr.은 0번째 행을 가지고 있따. arr0살리기위해 이런작업함
//       for (int b : brr) System.out.println("B="+b);

        arr[0] = arr[2];
        arr[2] =brr;

        brr =arr[2];
        arr[2] =arr[1];
        arr[1] =brr;
    }
}
