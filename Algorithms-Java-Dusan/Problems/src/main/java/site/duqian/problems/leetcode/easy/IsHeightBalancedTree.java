package site.duqian.problems.leetcode.easy;

import site.duqian.problems.TreeNode;

/**
 * Description:110. Balanced Binary Tree
 * 只是判断高度是否平衡，而不是判断平衡二叉树。
 * Given a binary tree, determine if it is height-balanced.
 * <p>
 * For this problem, a height-balanced binary tree is defined as a binary tree
 * in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * @author 杜乾-Dusan,Created on 2017/12/31 - 11:11.
 *         E-mail:duqian2010@gmail.com
 */
public class IsHeightBalancedTree {

    /**
     * Definition for a binary tree node.
     */
    /*public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }*/


    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = countDepth(root.left);
        int right = countDepth(root.right);
        if (Math.abs(left - right) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int countDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = countDepth(node.left);
        int right = countDepth(node.right);
        return Math.max(left, right) + 1;
    }
}
