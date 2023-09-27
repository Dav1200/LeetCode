import java.util.ArrayList;
import java.util.Collections;

public class symmetricTree {
     static class TreeNode {
        int val;
       TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }


    }

    public static boolean test(TreeNode a, TreeNode b){
       return false;

    }
    public static boolean isSymmetric(TreeNode root) {

         if(root.left ==null && root.right == null){
             return true;
         }


return false;

}

}
