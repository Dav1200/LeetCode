import javax.lang.model.type.IntersectionType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class findIntersection {


    public static String FindIntersection(String str) {
        // code goes here
        System.out.println(str.length());
        if(str.length()< 4 || str.length()>25 || !Character.isLetter(str.charAt(0)) || str.charAt(str.length()-1) == '_'){
            return "false";
        }

        for(int i = 0 ; i < str.length();i++){
            if(Character.isLetter(  str.charAt(i)) || Character.isDigit(  str.charAt(i))  ||str.charAt(i) == '_' ){
                continue;
            }
            else{
                return "false";
            }



        }

        return "true";


    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(FindIntersection("u__hello_world123"));



    }
}