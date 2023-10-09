public class convertTotitle {


    public static String cconvertToTitle(int columnNumber) {

        StringBuilder a = new StringBuilder();
        while (columnNumber > 0) {
            int reminder = columnNumber % 26;
            if (reminder == 0) {
                reminder = 26;
            }
            char add = 65;
            add += reminder - 1;
            a.append(add);
            columnNumber -= reminder;
            columnNumber /= 26;
        }


        return a.reverse().toString();
    }

    public static void main(String[] args) {



        //wb                       y
        //210
        // 23 times 26 times 26 +  2times 26 +  25 =


        // w times 26 times 26 , b times 26, + 26;


        System.out.println(cconvertToTitle(15625));

    }
}
