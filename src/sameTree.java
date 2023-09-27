import java.util.ArrayList;

public class sameTree {
    static boolean test = true;

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

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;

        /* 2. both non-empty -> compare them */
        if (p != null && q != null)
            return (p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right));

        /* 3. one empty, one not -> false */
        return false;

    }


    /*
    2=2

     */
    //
    public static void main(String[] args) {

        TreeNode a = new TreeNode(1);
        a.left = new TreeNode(2);

        TreeNode b = new TreeNode(1);

        b.right = new TreeNode(3);

        System.out.println(isSameTree(a, b));
    }
}
