import java.util.HashMap;
import java.util.Stack;

public class Main {
    //IIV
    public static int romanToInt(String s) {
        int total = 0;
        int temp = 0;
        boolean odd = false;
        for (int i = 0; i < s.length(); i++) {
            //System.out.println(i);
            //find patterns of two first

            if (i + 1 < s.length()) {
                if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {

                    total += 4;
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                    total += 9;
                    i++;
                    continue;

                }

                if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                    total += 40;
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                    total += 90;
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                    total += 400;
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                    total += 900;
                    i++;
                    continue;
                }
            }

            if (s.charAt(i) == 'I') {
                total += 1;
            }
            if (s.charAt(i) == 'V') {
                total += 5;
            }
            if (s.charAt(i) == 'X') {
                total += 10;
            }
            if (s.charAt(i) == 'L') {
                total += 50;
            }
            if (s.charAt(i) == 'C') {
                total += 100;
            }
            if (s.charAt(i) == 'D') {
                total += 500;
            }
            if (s.charAt(i) == 'M') {
                total += 1000;
            }


        }
        return total;
    }


    public static String longestCommonPrefix(String[] strs) {
//saved last comapre with next
        String longest = "";
        String prefix = "";

        if (strs.length == 1) {
            return strs[0];
        }
        int le = 0;
        for (int i = 0; i < strs.length; i++) {

            if (longest.length() < strs[i].length()) {
                le = longest.length();
            } else {
                le = strs[i].length();
            }
            if (i == 0) {
                longest = strs[i];
                continue;
            }

            prefix = "";


            for (int j = 0; j < le; j++) {
                if (longest.charAt(j) == strs[i].charAt(j)) {

                    prefix = prefix + longest.charAt(j);
                } else break;
            }
            longest = prefix;

        }

        return prefix;

    }


    public static boolean isValid(String s) {

        //  ({)}
//keep track of last opened clause and that should be the first closing clause,
        Stack<Character> close = new Stack<>();
        if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}' || s.length() == 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                close.push('(');}
            if (s.charAt(i) == '[') {
                close.push('[');}
            if (s.charAt(i) == '{') {
                close.push('{');}
            if (!close.isEmpty()) {
                if (s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']') {
                    if (s.charAt(i) == ')' && close.peek() == '(') {
                        close.pop();}
                    else if (s.charAt(i) == '}' && close.peek() == '{') {
                        close.pop();
                    } else if (s.charAt(i) == ']' && close.peek() == '[') {
                        close.pop();
                    } else {
                        return false;
                    }
                }
            } else {
                return false;}}
        return close.isEmpty();}

    public static void main(String[] args) {
        //  System.out.println(romanToInt("IXX"));

        //String[] test = new String[1];
        //test[0] = "a";

        //System.out.println(longestCommonPrefix(test));
       // System.out.println(isValid("("));
    }
}