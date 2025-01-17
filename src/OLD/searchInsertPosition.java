package OLD;
public class searchInsertPosition {

    public static int searchInsert(int[] nums, int target) {

       int left = 0;
       int right = nums.length-1;

       while(left<=right){
           int mid = left + (right - left) / 2;
           if(target == nums[mid]) {
               return mid;
           }
            if(nums[mid] < target)
           {
               left = mid+1;
           }
           else{
               right = mid-1;
           }



       }

return left;


    }

    public static void main(String[] args) {

        int[] list = {1,3,5,6,8};

        System.out.println(searchInsert(list,7));

    }
}
