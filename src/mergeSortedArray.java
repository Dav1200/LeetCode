import java.util.Arrays;
import java.util.Collections;

public class mergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n != 0 ) {
            for (int i = m; i < nums1.length; i++) {
                nums1[i] = nums2[i - m];
            }


        Arrays.sort(nums1);}

    }

    public static void main(String[] args) {

        int[] a = {4,5,6,0,0,0};
        int[] b = {1,2,3};
        merge(a, 3, b, 3);

    }
}
