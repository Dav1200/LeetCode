package OLD;
public class ArrangingCoins {
    public static int arrangeCoins(int n) {



        if(n == 1 || n ==2){
            return 1;
        }

        Long a = Long.parseLong(String.valueOf(n));


        Long track = 0L;

        for(int i =0; i<a;i++){
            track += i;

            if(track.equals(a)){
                return i;}

            if(track > a){
                return i-1;
            }


        }

        return 0;










    }

    public static void main(String[] args) {

        System.out.println(arrangeCoins(2147483647));
    }


}
