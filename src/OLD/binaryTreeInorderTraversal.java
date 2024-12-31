package OLD;
import java.util.ArrayList;
import java.util.List;

public class binaryTreeInorderTraversal {


    public static class TreeNode {
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


    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>  a = new ArrayList();
        if (root == null) {
            return a;
        }

        if(root.left != null){
            a.addAll(inorderTraversal(root.left));
        }

        a.add(root.val);

        if(root.right !=null){
            a.addAll(inorderTraversal(root.right));

        }
        return a;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        a.right = new TreeNode(2);
        a.right.left = new TreeNode(3);
        System.out.println(inorderTraversal(a));


    }
}
