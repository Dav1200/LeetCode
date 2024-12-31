package OLD;
public class lengthOfLastWord {

    public static  int lengthOfLastWord(String s) {


        //trim all extra spaces then substring from the last occurrence of ' '  and get the length of that
        s = s.trim();
        return s.substring(s.lastIndexOf(' ')+1).length();

    }

    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
}
