package site.duqian.problems.leetcode.easy;

import site.duqian.problems.TreeNode;

/**
 * Description:
 * Given two binary trees, write a function to check if they are the same or not.
 * Two binary trees are considered the same if they are structurally identical
 * and the nodes have the same value.
 * Example 1:Input:
 * 1         1
 * / \       / \
 * 2   3     2   3
 * <p>
 * [1,2,3],   [1,2,3]
 * <p>
 * Output: true
 * Example 2:
 * 1         1
 * /           \
 * 2             2
 * <p>
 * [1,2],     [1,null,2]
 * <p>
 * Output: false
 * Example 3:Input:
 * 1         1
 * / \       / \
 * 2   1     1   2
 * <p>
 * [1,2,1],   [1,1,2]
 * <p>
 * Output: false
 *
 * @author 杜乾-Dusan,Created on 2017/12/22 - 11:23.
 *         E-mail:duqian2010@gmail.com
 */
public class IsSameTree {
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

    public boolean isSameTree(TreeNode p, TreeNode q) {
        //一定要判断，都会null，为true
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null) {
            if (p.val == q.val) {
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            } else {
                return false;
            }
        }
        return false;
    }
}
