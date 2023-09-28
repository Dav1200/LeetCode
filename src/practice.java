import java.lang.reflect.Array;
import java.util.*;

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
        if (ispalin(str)) {
            return "palindrome";
        }

        for (int i = 0; i < str.length(); i++) {
            String changed = updateString(str, i);

            if (ispalin(changed)) {
                return str.charAt(i) + "";
            }

            for (int j = i + 1; j < str.length(); j++) {
                String changed2 = updateString(changed, j - 1);
                if (ispalin(changed2)) {
                    return str.charAt(i) + "" + str.charAt(j);
                }
            }

        }


        return "not possible";

    }


    public static String updateString(String str, int index) {

        return str.substring(0, index) + str.substring(index + 1);
    }

    public static boolean ispalin(String str) {

        StringBuilder reversed = new StringBuilder(str).reverse();
        if (str.equals(reversed.toString())) {
            return true;
        } else {
            return false;
        }
    }

    public static String nonrepeatingCharacter(String str) {
        str = str.toLowerCase();
        LinkedHashMap<Character, Integer> occr = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (occr.containsKey(str.charAt(i))) {
                occr.put(str.charAt(i), occr.get(str.charAt(i)) + 1);
            } else {
                occr.put(str.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : occr.entrySet()) {

            if (entry.getValue() == 1) {
                return entry.getKey() + "";
            }
        }
        return "asd";

    }

    public static int numberAddition(String str) {

        str = str.replaceAll("[^0-9]", " ");
        str = str.trim();
        String[] digit = str.split(" ");
        int sum = 0;
        for (int i = 0; i < digit.length; i++) {
            if (!digit[i].equals("")) {
                sum += Integer.parseInt(digit[i]);
            }
        }
        return sum;
    }

    public static int multiplicativePersistence(int num) {
        int times = 0;
        int prod = 1;

        while (num > 9) {
            String[] a = String.valueOf(num).split("");
            for (int i = 0; i < a.length; i++) {
                prod = prod * Integer.parseInt(a[i]);
            }
            times++;
            num = prod;
            prod = 1;


        }

        return times;

    }

    public static int meanMode(int[] nums) {
        int mean = 0;
        int mode = 0;
        HashMap<Integer, Integer> modeMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (modeMap.containsKey(nums[i])) {
                modeMap.put(nums[i], modeMap.get(nums[i]) + 1);
            } else {
                modeMap.put(nums[i], 1);
            }


            mean += nums[i];

        }
        mean = mean / nums.length;

        int high = 0;
        int value = 0;

        for (Map.Entry<Integer, Integer> ent : modeMap.entrySet()) {
            if (ent.getValue() > high) {
                high = ent.getValue();
                value = ent.getKey();
            }
        }
        if (value == mean) {
            return 1;
        } else
            return 0;

    }

    public static String arrayAdditionOne(int[] arr) {
        int total = 0;
        int highest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }


        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            if (arr[i] != highest) {
            }
            for (int k = 0; k < arr.length; k++) {
                if (arr[k] != highest && arr[k] != arr[i]) {
                    sum += arr[k];
                    if (sum == highest) {
                        return "true";
                    }
                }
            }
        }
        return "false";
    }

    public static int binaryReversal(String num ){
        int decimal = Integer.parseInt(num);
        String binary = Integer.toBinaryString(decimal);
        int maxlenght = (int) ((int) Math.ceil(binary.length()  / 8.0 )*8.0);

        StringBuilder newbinary = new StringBuilder(binary);
        while (newbinary.length()< maxlenght ){
            newbinary.insert(0,"0");
        }
        newbinary = newbinary.reverse();
        return Integer.parseInt(newbinary.toString(),2);


    }

    public static void main(String[] args) {
        var result1 = binaryReversal("47");
        System.out.println(result1);
        var result2 = binaryReversal("2");
        System.out.println(result2);
       // var result1 = arrayAdditionOne(new int[]{4, 6, 23, 10, 1, 3});
       // System.out.println(result1);
       // var result2 = arrayAdditionOne(new int[]{2, 6, 10, 18});
       // System.out.println(result2);


        //var result1 = meanMode(new int[]{5, 3, 3, 3, 1});
        //System.out.println(result1);
        //var result2 = meanMode(new int[]{64, 64, 64, 64, 64, 64, 64, 64, 1024});
        //System.out.println(result2);
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

        //var result1 = numberAddition("Chillhouse Mix 2 (2001)");
        //System.out.println(result1);
        //var result2 = numberAddition("Cafe del Mar 5 (1998)");
        //System.out.println(result2);

        //var res1 = nonrepeatingCharacter("agettkgaeee");
        //System.out.println(res1);
        //var res2 = nonrepeatingCharacter("A wise man apportions his beliefs to the evidence");
        //System.out.println(res2);

        //var result1 = multiplicativePersistence(2677889);
        //System.out.println(result1);
        //var result2 = multiplicativePersistence(8192);
        //System.out.println(result2);
    }
}

