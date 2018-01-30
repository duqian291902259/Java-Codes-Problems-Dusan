package site.duqian.problems.leetcode.easy;

import site.duqian.problems.TreeNode;

/**
 * Description:最小深度是指从根节点出发到达最近的叶子节点所需要经过的节点个数。
 * Given a binary tree, find its minimum depth.
 * <p>
 * The minimum depth is the number of nodes along the shortest path from the root node
 * down to the nearest leaf node.
 *
 * @author 杜乾-Dusan,Created on 2018/1/3 - 10:38.
 *         E-mail:duqian2010@gmail.com
 */
public class Tree_MinimumDepthOfBinaryTree {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;

        if (left == null) {
            return minDepth(right) + 1;
        }
        if (right == null) {
            return minDepth(left) + 1;
        }
        return Math.min(minDepth(left), minDepth(right)) + 1;
    }
}
