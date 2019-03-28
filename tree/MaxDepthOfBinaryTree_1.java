/**
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its depth = 3.
 *
 */



public class MaxDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int a = maxDepth(root.left) +1;
        int b = maxDepth(root.right)+1;

        return Math.max(a, b);
    }


    public static void main(String args[]) {
        TreeNode n0 = new TreeNode(2);
        TreeNode n1 = new TreeNode(7);
        n1.left = n0;
        TreeNode n2 = new TreeNode(15);
        TreeNode n3 = new TreeNode(20);
        n3.left = n2;
        n3.right = n1;
        TreeNode n4 = new TreeNode(9);
        TreeNode root = new TreeNode(3);
        root.left = n4;
        root.right = n3;

        MaxDepthOfBinaryTree m = new MaxDepthOfBinaryTree();
        System.out.println(m.maxDepth(root));
    }
}





//Definition for a binary tree node.





 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}