package tree;

/**
 * 判断是否为平衡二叉树：
 * 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。
 * 如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
 */
public class Solution55_2 {
    private class TreeNode{
        private int val;
        private TreeNode left;
        private TreeNode right;

        TreeNode(int x){
            this.val = x;
        }
    }

    public boolean isBalanced(TreeNode node){
        if(node == null){
            return true;
        }
        if(Math.abs(getMaxHeight(node.left) - getMaxHeight(node.right))>1){
            return false;
        }
        return isBalanced(node.left)&&isBalanced(node.right);

    }

    public int getMaxHeight(TreeNode node){
        if(node == null){
            return 0;
        }
        return Math.max(getMaxHeight(node.left),getMaxHeight(node.right)) + 1;
    }


}
