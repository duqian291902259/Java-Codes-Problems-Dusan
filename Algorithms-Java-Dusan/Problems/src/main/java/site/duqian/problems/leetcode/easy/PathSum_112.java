package site.duqian.problems.leetcode.easy;


import site.duqian.problems.TreeNode;

/**
 * Description:二叉树路径求和
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path
 * such that adding up all the values along the path equals the given sum.
 * <p>
 * For example:
 * Given the below binary tree and sum = 22,
 * 5
 * / \
 * 4   8
 * /   / \
 * 11  13  4
 * /  \      \
 * 7    2      1
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 *
 * @author 杜乾-Dusan,Created on 2018/1/5 - 12:05.
 *         E-mail:duqian2010@gmail.com
 */
public class PathSum_112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        int val = root.val;
        if (left == null && right == null && sum == val) {
            return true;
        }
        int sumNext = sum - val;
        return hasPathSum(left, sumNext) || hasPathSum(right, sumNext);
    }
}
