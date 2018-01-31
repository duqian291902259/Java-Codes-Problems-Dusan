package site.duqian.problems.leetcode.easy;

import site.duqian.problems.TreeNode;

/**
 * Description:
 * Given a binary tree, check whether it is a mirror of itself
 * (ie, symmetric around its center).
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * But the following [1,2,2,null,3,null,3] is not:
 *     1
 *    / \
 *   2   2
 *   \    \
 *    3    3
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
 *
 * @author 杜乾-Dusan,Created on 2017/12/25 - 18:15.
 *         E-mail:duqian2010@gmail.com
 */
public class SymmetricTree {

    //Definition for a binary tree node.
    /*public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }*/

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode lt, TreeNode rt) {
        if (lt == null && rt == null) {
            return true;
        }
        boolean b1 = lt == null && rt != null;
        boolean b2 = rt == null && lt != null;
        if (b1 || b2 || lt.val != rt.val) {
            return false;
        }
        return isSymmetric(lt.left, rt.right) && isSymmetric(lt.right, rt.left);
    }
}
