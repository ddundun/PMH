public class Ex10 {
    public static void main(String[] args) {
        int arr[][] = {
                {11},
                {11,22},
                {11,22,33}

        };
        System.out.println(arr.length); //전체는 그냥 arr, 3 배열이 몇개냐? 라서 3
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
        System.out.println(arr[2].length);
        System.out.println();

        for (int i =0; i<arr.length; i++) {
            for (int j =0; j<arr[i].length; j++) {
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
