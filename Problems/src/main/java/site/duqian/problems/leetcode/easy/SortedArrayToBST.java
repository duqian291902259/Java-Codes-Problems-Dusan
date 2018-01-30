package site.duqian.problems.leetcode.easy;

import site.duqian.problems.TreeNode;

/**
 * Description:108. Convert Sorted Array to Binary Search Tree
 * Given an array where elements are sorted in ascending order,
 * convert it to a height balanced BST.
 * <p>
 * For this problem, a height-balanced binary tree is defined as a binary tree
 * in which the depth of the two subtrees of every node never differ by more than 1.
 * <p>
 * Example:
 * Given the sorted array: [-10,-3,0,5,9],
 * One possible answer is: [0,-3,9,-10,null,5],
 * which represents the following height balanced BST:
 * 0
 * / \
 * -3   9
 * /   /
 * -10  5
 *
 * @author 杜乾-Dusan,Created on 2017/12/31 - 10:53.
 *         E-mail:duqian2010@gmail.com
 */
public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        int len = nums.length;
        TreeNode node = createNode(nums, 0, len - 1);
        return node;
    }

    private TreeNode createNode(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (right + left) / 2;//中间索引是加，不是相减
        int num = nums[mid];
        TreeNode node = new TreeNode(num);
        node.left = createNode(nums, left, mid - 1);
        node.right = createNode(nums, mid + 1, right);
        return node;
    }

    public void printTree(TreeNode node) {
        if (node == null) {
            return;
        }
        printTree(node.left);
        System.out.println(" " + node.val);
        printTree(node.right);
    }

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
}
