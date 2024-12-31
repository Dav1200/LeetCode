package OLD;
public class FindtheIndexoftheFirstOccurrenceinaString {

    public static int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()){
            return -1;
        }
            int an = needle.length();
            boolean a = false;
            int start = 0;
            int count = 0;
        for(int i =0 ; i< haystack.length();i++) {
            //System.out.println(needle.charAt(count));
            if(haystack.charAt(i) == needle.charAt(count)){
                if(!a){
                    start = i;
                    a = true;
                }
                if(haystack.charAt(i) != needle.charAt(count)) {
                    i = start;
                }
                count++;
                if(count == needle.length()){
                    return start;
                }
            }
            else {
                i -= count;
                a = false;
                start = 0;
                count = 0;
            }
        }
        start=-1;
return  start;
    }
    public static void main(String[] args) {
        System.out.println(strStr("sdbutsad","sad"));



    }
}
