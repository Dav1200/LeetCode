import java.util.ArrayList;
import java.util.List;

public class preOrder {

    List<Integer> list = new ArrayList<>();

      public class TreeNode {
          int val;
          TreeNode left;
       TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;this.left = left;
             this.right = right;
          }
      }


    public List<Integer> preorderTraversal(TreeNode root) {

        list.add(root.val);

        if (root.left != null) {
            preorderTraversal(root.left);
        } else {
            preorderTraversal(root.right);


        }
        return list;
    }
    public static void main(String[] args) {

    }
}
