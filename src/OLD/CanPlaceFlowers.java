package OLD;
public class CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(n ==0){
            return true;
        }
        if (flowerbed.length == 1) {
            if (flowerbed[0] == 0 && n == 1) {
                return true;
            } else {
                return false;
            }

        }

        for (int i = 0; i < flowerbed.length; i++) {
            if(n == 0){
                return true;
            }
            if(i == 0){
                if(flowerbed[i] == 0 && flowerbed[i+1] == 0){
                    flowerbed[i] = 1;
                    n--;

                }
            }

            if(i == flowerbed.length-1){
                if(flowerbed[i] == 0 && flowerbed[i-1] == 0){
                    flowerbed[i] = 1;
                    n--;

                }
            }

            if(i!=0 && i!= flowerbed.length-1){
                if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0 && flowerbed[i] == 0){
                    flowerbed[i] =1;
                    n--;
                }
            }}

        return n==0;

    }

    public static void main(String[] args) {

        int[] a = {1, 0, 0, 0, 1, 0, 0};
        canPlaceFlowers(a, 2);
    }
}
