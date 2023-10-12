public class MoveZeros {

    public static void moveZeroes(int[] nums) {

        int zeros = 0;
        int indexzero = 0;
        for (int i = 0; i < nums.length; i++) {

            if(nums[i] != 0){
                nums[indexzero] = nums[i];
                indexzero++;
            }

        }

        for(int i= indexzero;i<nums.length;i++){
            nums[i] = 0;
        }

    }


    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
    }
}
