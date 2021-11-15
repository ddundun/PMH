package Quiz;

public class dfs {

    public static void main(String[] args) {
        int sum = 0;
        int num = 1; 
    
        while(true) {
            if(num % 2 != 0)
                sum += num;

            if(sum > 1000) {
                System.out.println(num );
                System.out.println( sum);
                break;
            }
            
            num++;
        }
    }
}
