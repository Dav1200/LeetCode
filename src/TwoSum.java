public class TwoSum {

    public static boolean twoSum(int target, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    if (nums[i] + nums[j] == target) {
                        return true;
                    }
                }
            }
        }
        return  false;
    }
    
    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5,6};
        System.out.println(twoSum(222,nums));
    }
}
