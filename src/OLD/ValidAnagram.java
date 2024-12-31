package OLD;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidAnagram {

    public static boolean isanagram(String s, String t){

        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> a = new HashMap<>();
        for(int i = 0; i <s.length();i++){
            if(a.containsKey(s.charAt(i))){
                a.put(s.charAt(i),a.get(s.charAt(i))+1);
            }
            else{
                a.put(s.charAt(i),1);
            }
        }


        for(int i = 0; i <t.length();i++){
            if(a.containsKey(t.charAt(i))){
            a.put(t.charAt(i),a.get(t.charAt(i))-1);
            if(a.get(t.charAt(i)) == 0){
                a.remove(t.charAt(i));
            }}
        }


if(a.size()>0){
    return false;
}
        return true;
    }

    public static void main(String[] args) {
        System.out.println( isanagram("rat","car"));
    }
}
