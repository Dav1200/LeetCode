public class HappyNumber
{




    public static boolean isHappy(int n) {


        String newN = Integer.toString(n);


         if(n == 1){
             return true;
         }
        if(newN.length() ==1 && n !=1){
            return false;
        }

        while(n!=0) {

            if(n == 1){
                return true;
            }

            n = Integer.parseInt(newN.substring(0, 1)) * Integer.parseInt(newN.substring(0, 1));
            n += Integer.parseInt(newN.substring(1)) * Integer.parseInt(newN.substring(1));
            newN = Integer.toString(n);

        }

        return false;


    }




    public static void main(String[] args) {
        isHappy(2);

    }
}
