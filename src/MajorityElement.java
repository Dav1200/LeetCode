import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {

        int major = nums.length / 2;
        int ret = 0;

        HashMap<Integer, Integer> majority = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (majority.containsKey(nums[i])) {
                majority.put(nums[i], majority.get(nums[i]) + 1);
            } else {
                majority.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> a : majority.entrySet()) {
            if (a.getValue() > major) {
                ret = a.getKey();

            }
        }

        return ret;

    }

    public static void main(String[] args) {

    }
}
