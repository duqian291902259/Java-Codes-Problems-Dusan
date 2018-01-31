package site.duqian.problems.leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import site.duqian.problems.TreeNode;

/**
 * Description:
 * Given a binary tree, return the bottom-up level order traversal
 * of its nodes' values. (ie, from left to right, level by level from leaf to root).
 * <p>
 * Given binary tree [3,9,20,null,null,15,7],
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * return its bottom-up level order traversal as:
 * [
 * [15,7],
 * [9,20],
 * [3]
 * ]
 *
 * @author 杜乾-Dusan,Created on 2017/12/27 - 11:51.
 *         E-mail:duqian2010@gmail.com
 */
public class LevelOrderBottom {
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

    private List<List<Integer>> listAll = new ArrayList<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        levelRecursion(root, 0);
        Collections.reverse(listAll);
        return listAll;
    }

    private void levelRecursion(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        int size = listAll.size();
        int nextLevel = level + 1;
        if (size < nextLevel) {
            listAll.add(new ArrayList<Integer>());
        }
        listAll.get(level).add(root.val);
        levelRecursion(root.left, nextLevel);
        levelRecursion(root.right, nextLevel);
    }

    /**
     * 层序遍历
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderBottom2(TreeNode root) {
        if (root == null) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        listAll.add(list);

        if (root.left != null) {
            levelOrderBottom2(root.left);
        }
        if (root.right != null) {
            levelOrderBottom2(root.right);
        }
        return listAll;
    }
}
