public class MissingNumber {

    public int missingNumber(int[] nums) {
 // to find highest number in array
        int total = 0;
        for (int i = 0; i < nums.length; i++) {

            total += nums[i];
        }
        return nums.length * (nums.length + 1) / 2-total;

    }
}
