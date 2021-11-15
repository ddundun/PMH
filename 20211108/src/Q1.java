import java.util.Scanner;

public class Q1 {
    public static int minValue (int[] arr) {
        int min =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]) {
                min=arr[i];
//                System.out.println(min);
            }
        }
        return min;
    }
    public static int maxValue (int[] arr){
        int max = arr[0];
        for (int i =0; i< arr.length; i++) {
            if(max<arr[i]) {
                max=arr[i];
//                System.out.println(max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {50,2,3,4,15,16,7,-1,9};
//        Scanner scan= new Scanner(System.in);
//        int input[] = scan.

        System.out.println(minValue(arr));
        System.out.println(maxValue(arr));
    }
}
