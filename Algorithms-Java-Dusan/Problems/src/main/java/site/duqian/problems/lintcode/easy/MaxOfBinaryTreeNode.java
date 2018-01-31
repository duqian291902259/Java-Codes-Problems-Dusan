package site.duqian.problems.lintcode.easy;

import site.duqian.problems.TreeNode;

/**
 * Description:632. 二叉树的最大节点
 * 在二叉树中寻找值最大的节点并返回。
 * 样例
 * 给出如下一棵二叉树：
 * <p>
 * 1
 * /  \
 * -5    2
 * / \   /  \
 * 0   3 -4  -5
 * 返回值为 3 的节点。
 *
 * @author 杜乾-Dusan,Created on 2017/11/30 - 14:29.
 *         E-mail:duqian2010@gmail.com
 */
public class MaxOfBinaryTreeNode {

    /*public static class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }*/

    /**
     * @param root: the root of tree
     * @return: the max node
     */
    public TreeNode maxNode(TreeNode root) {
        // write your code here
        if (root == null) {
            return null;
        }
        maxNode = root;
        //遍历二叉树
        return orderTree(root);
    }

    //最大节点
    private TreeNode maxNode = null;
    //最大值
    private int maxVal = 0;

    private TreeNode orderTree(TreeNode root) {
        if (root != null) {
            int val = root.val;
            System.out.println(val);
            if (val >= maxVal) {
                maxVal = val;
                maxNode = root;
            }
            orderTree(root.left);
            orderTree(root.right);
        }
        return maxNode;
    }

}
