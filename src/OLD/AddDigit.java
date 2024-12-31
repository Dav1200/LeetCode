package OLD;
public class AddDigit {

    public static int addDigits(int num) {



        String numA = String.valueOf(num);

        if(numA.length() <2){
            return num;
        }

        while(numA.length() != 1){

            numA = String.valueOf(Integer.parseInt(numA.substring(0,1)) + Integer.parseInt(numA.substring(1)));

        }
        return Integer.parseInt(numA);
    }
    public static void main(String[] args) {

        addDigits(38);

    }
}
