package OLD;
public class sqrt {

    public static  int mySqrt(int x) {


        if(x==1){
            return 1;
        }
        for(long i = 1 ;i <= x;i++){

            if(i*i == x){
                return (int)i;
            }
            if(i*i >x){
                return (int)i-1;

            }
        }
        return 0;

    }

    public static void main(String[] args) {

        System.out.println(mySqrt(2147483647));
    }
}
