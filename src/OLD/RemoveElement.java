package OLD;
public class RemoveElement {

    public static int removeElement(int[] nums, int val){
        int idx = 0;
        if(nums.length==0){
            return 0;
        }
      for(int i = nums.length-1 ;i>= 0;i--){
          if(nums[i] == val){
              int temp = nums[nums.length-1-idx];
              nums[nums.length-1-idx] = val;
              nums[i] = temp;
              idx++;
          }
      }
        return nums.length - idx;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums,2));
    }
}
