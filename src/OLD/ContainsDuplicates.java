package OLD;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicates {

    public static boolean containsDuplicate(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return false;
        }
        HashMap<Integer, Integer> dupTable = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (dupTable.containsKey(nums[i])) {
                dupTable.put(nums[i], dupTable.get(nums[i]) + 1);
            } else {
                dupTable.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> map : dupTable.entrySet()) {
            if (map.getValue() > 1) {
                return true;
            }

        }
        return false;

    }
}
