package site.duqian.problems.lintcode.easy;

import site.duqian.problems.TreeNode;

/**
 * Description:给定一棵二叉查找树和一个新的树节点，将节点插入到树中。
 * 你需要保证该树仍然是一棵二叉查找树。
 * You can assume there is no duplicate values in this tree + node.
 * <p>
 * 给出如下一棵二叉查找树，在插入节点6之后这棵二叉查找树可以是这样的：
 * <p>
 * 2             2
 * / \           / \
 * 1   4   -->   1   4
 * /             / \
 * 3             3   6
 * 二叉查找树（BST：Binary Search Tree）是一种特殊的二叉树，它改善了二叉树节点查找的效率。
 * 二叉查找树有以下性质：
 * 对于任意一个节点 n，
 * 其左子树（left subtree）下的每个后代节点（descendant node）的值都小于节点 n 的值；
 * 其右子树（right subtree）下的每个后代节点的值都大于节点 n 的值。
 * 所谓节点 n 的子树，可以将其看作是以节点 n 为根节点的树。子树的所有节点都是节点 n 的后代，而子树的根则是节点 n 本身。
 *
 * @author 杜乾-Dusan,Created on 2018/1/8 - 10:50.
 *         E-mail:duqian2010@gmail.com
 */
public class InsertNode2BinarySearchTree {
    /**
     * @param root: The root of the binary search tree.
     * @param node: insert this node into the binary search tree
     * @return: The root of the new binary search tree.
     */
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if (root == null) {
            return node;
        }
        int rootVal = root.val;
        int val = node.val;
        if (val >= rootVal) {
            TreeNode right = root.right;
            if (right == null) {//要考虑为空的情况
                root.right = node;
            } else {
                insertNode(right, node);
            }
        } else if (val < rootVal) {
            TreeNode left = root.left;
            if (left == null) {
                root.left = node;
            } else {
                insertNode(left, node);
            }
        }
        return root;
    }
}
