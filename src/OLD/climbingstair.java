package OLD;
public class climbingstair {
    public static int climbStairs(int n) {
        int first =1;
        int second = 2;
//fibonnaci sequence
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;

        }


        for(int i = 3;i<=n;i++){
            int temp = first + second;
            first = second;
            second = temp;
        }

        return second;
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(6));


    }
}
