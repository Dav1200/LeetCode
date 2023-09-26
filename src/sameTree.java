public class sameTree {

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



        
    }
    public static void main(String[] args) {

       TreeNode a = new TreeNode(1);
       a.left = new TreeNode(2);
       a.right = new TreeNode(3);
        TreeNode b = new TreeNode(1);
        b.left = new TreeNode(2);
        b.right = new TreeNode(3);

        System.out.println(isSameTree(a,b));
    }
}
