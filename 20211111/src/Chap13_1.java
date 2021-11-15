//*
// 문제1
// 다음 메소드는 int형 1차원 배열에 저장된 값을 두 번째 매개변수로 전달된 값의 크기만큼 전부 증가시킨다.
//
//    public static void addOneDArr (int[] arr, int add) {
//        for (int i =0; i<arr.length; i++)
//            arr[0] +=add;
//
//    }
//    위 메소드를 호출하는 형태로, int형 2차원 배열에 저장된 값 전부를 두번째 매개변수로 전달된 값의 크기만큼 증가시키는 메소드를 다음의 형태로 정의하자.
//        public static void

public class Chap13_1 {
//    1차원 배열을 파라메터로 받고 add만큼 증가시키는 함수
//    arr= 10,5,3,2,7
//    add =4
//    5+3 =8
//    8 = 5+3
    public static void addOneDArr(int[] arr, int add) {
        for (int i =0; i<arr.length; i++)
            arr[i] += add;
    }
    public static void addTwoDArr(int[][] arr, int add) {
//        이 안에서 addOneDarr 메서드를 호출한다.
        for (int temp_arr[] : arr) { //2차원배열에서 하나가져오면 1차원배열
            //10, 5, 2
            addOneDArr(temp_arr,add);
        }

    }

    public static void main(String[] args) {
//        int arr[] = {10,5,3,2,7};
//        int add =4; // -> 14 9 7 6 11
//        addOneDArr(arr,add);

//        for (int temp: arr)
//            System.out.println("temp = "+temp);

//        2차원 배열은 1차원 배열이 여러개..
//        3차원 배열은 2차원 배열이 여러개..
        int darr[][] = {{10,5,2},{1,2,3,4},{6,7,8,9,10}}; //2차원배열
        int add =4;

        for ( int temp_arr[]: darr) { //1차원 배열로..?? 모르겠땅 ㅎ
            for (int temp:temp_arr) //1차원배열에서 요소뽑ㅇㅏ내기
                System.out.println("temp = "+temp);
            System.out.println();
        }

        System.out.println("--------- 변경 후 ----------");
        addTwoDArr(darr,4);
        for(int temp_arr[] : darr) {
            for (int temp: temp_arr)
                System.out.println("temp = "+temp);
            System.out.println();
        }

    }
}

