package tree;


import com.sun.xml.internal.bind.v2.TODO;

import java.util.HashMap;
import java.util.Map;

/**
 * 重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 */

public class Solution7 {

    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder){

        //前序遍历 Preorder = [3,9,20,15,7]
        //中序遍历 inorder = [9,3,15,20,7]
        //      3
        //      /\
        //      9 20
        //     /    \
        //     15    7

        //首先先对先序队列进行判空
        if(preorder == null || preorder.length == 0){
            return null;
        }
        //定义一个Map用于存放中序队列中元素的位置
        Map<Integer,Integer> indexMap = new HashMap<Integer, Integer>();
        int length = preorder.length;
        for(int i = 0 ; i < length ; i ++){
            indexMap.put(inorder[i],i);
        }
        //新建一个函数用于生成二叉树，并返回根节点
        TreeNode root = buildTree(preorder,0,length-1,inorder,0,length-1,indexMap);
        return root;
    }

    private TreeNode buildTree(int[] preorder, int preorderStart, int preorderEnd,int[] inorder,
                               int inorderStart, int inorderEnd, Map<Integer, Integer> indexMap) {
        //先对先序队列的首尾进行判断
        if(preorderStart > preorderEnd){
            return null;
        }
        //先获取先序队列的首个元素，作为子树的根节点
        int rootVal = preorder[preorderStart];
        TreeNode root = new TreeNode(rootVal);
        if(preorderStart == preorderEnd){
            return root;
        }else{
            //从中序队列中获取到根节点的下标
            int rootIndex = indexMap.get(rootVal);
            //TODO 这里没搞懂
            int leftNodes = rootIndex - inorderStart, rightNodes = inorderEnd - rootIndex;
            //继续递归下去
            TreeNode leftSubtree = buildTree(preorder,preorderStart + 1,preorderStart + leftNodes,
                    inorder,inorderStart,rootIndex - 1,indexMap);
            TreeNode rightSubtree = buildTree(preorder,preorderEnd - rightNodes + 1, preorderEnd,
                    inorder,rootIndex + 1 , inorderEnd , indexMap);
            root.left = leftSubtree;
            root.right = rightSubtree;
            return root;
        }
    }
}
