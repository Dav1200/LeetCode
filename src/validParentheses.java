import java.util.Stack;

public class validParentheses {
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
         System.out.println(isValid("("));
    }
}
