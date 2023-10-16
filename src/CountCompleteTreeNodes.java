public class CountCompleteTreeNodes {

     static int count =0;
    public static int countNodes(binaryTreeInorderTraversal.TreeNode a){
      if(a == null){
          return 0;
      }
      else {
          return  1+countNodes(a.left)
                  + countNodes(a.right);
      }

}
}
