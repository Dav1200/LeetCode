public class plusOne {

    public  static  int[] plusOne(int[] digits) {


        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }



        boolean all9 = true;
        int changeIndex = 0;

        for(int i = digits.length-1; i>=0;i--){

            if(digits[i] != 9){
                all9 =false;
                changeIndex = i;
                break;
            }
        }
        int[] b = new int[digits.length];


        if(all9){
            int[] a = new int[digits.length+1];
            a[0] = 1;
            return a;
        }



        else
            for(int i =0;i<=changeIndex;i++){
                b[i] = digits[i];

                if(i == changeIndex){
                    b[i] = b[i] +1;
                }
            }
            return b;

    }

    public static void main(String[] args) {

        int[] array = {8,9,9,9};
        System.out.println(plusOne(array));

    }
}
