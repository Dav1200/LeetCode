package OLD;
public class ExelWord {

    public static  int titleToNumber(String columnTitle) {


        if(columnTitle.length() ==1){
            int a = columnTitle.charAt(0) - 64;
            return a;
        }

        int total = 0;
        int count = 1;

        for(int i = columnTitle.length()-2; i >=0;i--)
        {
            int a = columnTitle.charAt(i) - 64;
            total += a * Math.pow(26,count);
                count++;
        }



        //ignore the last letter
        return total + columnTitle.charAt(columnTitle.length()-1) - 64;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("FXSHRXW"));
    }
}
