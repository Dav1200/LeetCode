package OLD;
public class PowerOf2 {

    public static boolean isPowerOfTwo(int n) {
        if(n == 1 )
        {return true;}
        if(n == 0){
            return false;
        }


        while(n !=2){
            if(n%2 ==0){
                n = n/2;
            }
            else{
                return false;
            }
        }

        return true;}

    public static void main(String[] args) {
    isPowerOfTwo(24);
    }
}
