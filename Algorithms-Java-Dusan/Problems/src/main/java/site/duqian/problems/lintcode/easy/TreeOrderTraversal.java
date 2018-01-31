package site.duqian.problems.lintcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import site.duqian.problems.TreeNode;

/**
 * Description:66. 二叉树的遍历
 * 给出一棵二叉树，返回其节点值的前序遍历。
 *
 * @author 杜乾-Dusan,Created on 2018/1/3 - 13:18.
 *         E-mail:duqian2010@gmail.com
 */
public class TreeOrderTraversal {
    /**
     * 二叉树前序遍历
     *
     * @param root: A Tree
     * @return: Preorder in ArrayList which contains node values.
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        if (root == null) {
            return null;
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }

    /**
     * 二叉树中序遍历
     *
     * @param root: A Tree
     * @return: inorder in ArrayList which contains node values.
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        if (root == null) {
            return null;
        }
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }

    /**
     * 二叉树后序遍历
     *
     * @param root: A Tree
     * @return: postorder in ArrayList which contains node values.
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        if (root == null) {
            return null;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
        return list;
    }

    public static List<Integer> list = new ArrayList<>();

    /**
     * @param root: A Tree
     * @return: Level order a list of lists of integer
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        levelRecursion(root, 0);
        Collections.reverse(listAll);
        return listAll;
    }

    private List<List<Integer>> listAll = new ArrayList<>();

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


}
