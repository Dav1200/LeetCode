public class longestCommonPrefix {

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
    public static void main(String[] args) {
        String[] test = new String[1];
       test[0] = "a";

        System.out.println(longestCommonPrefix(test));
    }
}
