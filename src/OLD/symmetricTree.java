package OLD;
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
        if(a ==null && b == null){
            return true;
        }
        if( a== null && b !=null || a!= null && b==null){
            return false;
        }
        if(a.val != b.val){
            return false;
        }

        return test(a.left,b.right) && test(a.right,b.left);

    }
    public static boolean isSymmetric(TreeNode root) {

       return  test(root.left,root.right);


}

}
