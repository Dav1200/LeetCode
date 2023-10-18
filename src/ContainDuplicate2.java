import java.util.HashMap;

public class ContainDuplicate2 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length <= 1) {
            return false;
        }


        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    int num = Math.abs(i - j);
                    if (num <= k) {
                        return true;
                    }
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,1,2,3};
        containsNearbyDuplicate(a,2);
    }

}
