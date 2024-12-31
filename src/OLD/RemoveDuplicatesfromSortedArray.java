package OLD;
public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;}
        int idx = 0;
        for(int i = 1 ;i<nums.length;i++){
            if(nums[i] != nums[idx]){
                idx++;
                nums[idx] = nums[i];
            }
        }return idx+1;}
    public static void main(String[] args) {
        int[] nums = {94,95,96,96,97};
        removeDuplicates(nums);
    }
}
