import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class practice {

    public static String power2(int num) {
        if (num == 0) {
            return "false";
        }

        while (num != 2) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                return "false";
            }

        }
        return "true";

    }

    public static String stringMerge(String str) {

        String[] strList = str.split("\\*");
        StringBuilder combinedString = new StringBuilder();
        for (int i = 0; i < strList[0].length(); i++) {
            combinedString.append(strList[0].charAt(i));
            combinedString.append(strList[1].charAt(i));

        }
        return combinedString.toString();


    }

    public static String swapCase(String str) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                newString.append(Character.toUpperCase(str.charAt(i)));
            } else {
                newString.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        return newString.toString();

    }

    public static String simpleSymbols(String str) {
        boolean seen = false;
        boolean seenletter = false;


        for (int i = 0; i < str.length(); i++) {

            if (Character.isLetter(str.charAt(i)) && !seen) {
                return "false";
            }
            if (str.charAt(i) == '+') {
                seen = true;
            }
            if (seen) {
                if (Character.isLetter(str.charAt(i))) {
                    seenletter = true;
                }
            }
            if (seen && seenletter) {
                if (str.charAt(i) == '+') {
                    seen = false;
                }
            }
        }

        if (seen) {
            return "false";
        }
        return "true";

    }

    public static String snakeCase(String str) {
        str = str.replaceAll("\\p{Punct}", "");
        str = str.trim();
        str = str.replaceAll(" ", "_");
        str = str.toLowerCase();
        return str;


    }

    public static String simpleEvens(Integer num) {
        String[] nums = String.valueOf(num).split("");

        for (int i = 0; i < nums.length; i++) {
            if (Integer.parseInt(nums[i]) % 2 != 0) {
                return "false";
            }
        }

        return "true";
    }

    public static String superincreasing(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > sum) {
                sum += arr[i];
            } else {
                return "false";
            }
        }
        return "true";
    }

    public static int simpleAdding(int num) {
        int total = 0;
        for (int i = 0; i <= num; i++) {
            total += i;
        }

        return total;
    }

    public static String thirdGreatest(String[] str) {

        Arrays.sort(str, Comparator.comparing(String::length).reversed());

        String word = "";
        for (int i = 0; i < str.length; i++) {
            if (i == 2) {
                word = str[i];
            }
        }
        return word;
    }

    public static String palindromeCreator(String str) {
        if (ispalin(str)){
            return "palindrome";
    }

        for(int i = 0 ; i< str.length();i++){
            String changed = updateString(str,i);

            if(ispalin(changed)){
                return str.charAt(i)+"";
            }

            for(int j = i+1;j<str.length();j++){
                String changed2 = updateString(changed,j-1);
            if(ispalin(changed2)){
                return str.charAt(i) +""+str.charAt(j);
            }
            }

        }


return "not possible";

}


public static String updateString(String str, int index){

        return str.substring(0,index) + str.substring(index+1);
}
public static boolean ispalin(String str){

        StringBuilder reversed = new StringBuilder(str).reverse();
        if(str.equals(reversed.toString())){
            return true;
        }
        else {
            return false;
        }
}


public static int numberAddition(String str) {

    str = str.replaceAll("[^0-9]", " ");
    str = str.trim();
    String[] digit = str.split(" ");
    int sum = 0;
    for (int i = 0; i < digit.length; i++) {
        if(!digit[i].equals("")){
        sum += Integer.parseInt(digit[i]);
    }}
    return sum;
}
    public static void main(String[] args) {

        //String result = stringMerge("abc1*kyoo");
        //System.out.println(result);

        //String result1 = swapCase("Hello World");
        //System.out.println(result1);

        //var result1 = superincreasing(new int[]{3,3});
        //System.out.println(result1);

        //var result1 = snakeCase("Revolt& is& the right of the people");
        // System.out.println(result1);

        // var result2 = simpleSymbols("=+e++r+ff+v+");
        //System.out.println(result2);

      //  String result1 = simpleEvens(222252);
      //  System.out.println(result1);
        //String result2 = simpleEvens(228);
       // System.out.println(result2);


       // var result1 = simpleAdding(100);
       // System.out.println(result1);
        //var result2 = simpleAdding(8);
       // System.out.println(result2);

        //var result1 = thirdGreatest(new String[]{"flowers", "decorate", "soul", "sleep"});
        //System.out.println(result1);
        //var result2 = thirdGreatest(new String[]{"surrounded", "darkness", "awakened", "within"});
        //System.out.println(result2);


        //var result2 = palindromeCreator("racecar");
        //System.out.println(result2);
       // var result1 = palindromeCreator("vhhgghhgghhk");
       // System.out.println(result1);
       // var result3 = palindromeCreator("abca");
       // System.out.println(result3);

        var result1 = numberAddition("Chillhouse Mix 2 (2001)");
        System.out.println(result1);
        var result2 = numberAddition("Cafe del Mar 5 (1998)");
        System.out.println(result2);
    }
    }

