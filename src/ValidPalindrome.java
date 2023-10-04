public class ValidPalindrome
{

    public static boolean isplain(String str){
        str = str.toLowerCase();
        str = str.replaceAll(" ", "");
        if(str.length() == 0){
            return true;
        }

        StringBuilder newStr = new StringBuilder();

        for(int i = 0;i< str.length();i++){
            if(Character.isLetter(str.charAt(i))|| Character.isDigit(str.charAt(i))){
                newStr.append(str.charAt(i));
            }


        }
        str = newStr.toString();
        String reversed = newStr.reverse().toString();

        if(reversed.equals(str)){
            return true;

        }
        if(reversed.length() == 0){
            return true;
        }

        return false;


    }

    public static void main(String[] args) {
        isplain("race a car");
    }}
