public class romanInt {
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


    public static void main(String[] args) {
        System.out.println(romanToInt("IXX"));


    }
}