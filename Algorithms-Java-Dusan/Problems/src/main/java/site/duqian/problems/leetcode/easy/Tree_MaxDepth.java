package site.duqian.problems.leetcode.easy;

import site.duqian.problems.TreeNode;

/**
 * Description:
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes
 * along the longest path from the root node down to the farthest leaf node.
 *
 * @author 杜乾-Dusan,Created on 2017/12/26 - 17:51.
 *         E-mail:duqian2010@gmail.com
 */
public class Tree_MaxDepth {

    /**
     * Definition for a binary tree node.
     */
    /*public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int x) {
            val = x;
        }
    }*/

    public int maxDepth(TreeNode root) {
        //return countDepth(root);
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
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