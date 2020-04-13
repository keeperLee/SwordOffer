package tree;

/**
 *  二叉树的深度
 *  输入一棵二叉树的根节点，求该树的深度。
 *  从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，
 *  最长路径的长度为树的深度。
 */
public class Solution55_1 {
    public static class TreeNode{
        protected int val;
        protected TreeNode left;
        protected TreeNode right;

        public TreeNode(int x){
            this.val = x;
        }
    }

    public int maxDepth(TreeNode node){
        if(node == null){
            return 0;
        }
        int leftHeight = maxDepth(node.left);
        int rightHeight = maxDepth(node.right);
        return Math.max(leftHeight,rightHeight) + 1;
    }


}

class Testfor55_1{
    public static void main(String[] args) {
        Solution55_1.TreeNode root = new Solution55_1.TreeNode(1);
        Solution55_1.TreeNode left = new Solution55_1.TreeNode(2);
        root.left = left;
        System.out.println(new Solution55_1().maxDepth(root));
    }
}
