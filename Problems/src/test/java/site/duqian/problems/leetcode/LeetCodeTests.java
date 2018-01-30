package site.duqian.problems.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import site.duqian.problems.ListNode;
import site.duqian.problems.TreeNode;
import site.duqian.problems.leetcode.easy.BinaryAdd67;
import site.duqian.problems.leetcode.easy.ClimbStairs;
import site.duqian.problems.leetcode.easy.CountAndSay38;
import site.duqian.problems.leetcode.easy.ImplementStr;
import site.duqian.problems.leetcode.easy.IsHeightBalancedTree;
import site.duqian.problems.leetcode.easy.IsSameTree;
import site.duqian.problems.leetcode.easy.LengthOfLastWord58;
import site.duqian.problems.leetcode.easy.LevelOrderBottom;
import site.duqian.problems.leetcode.easy.MaximumSubarray53;
import site.duqian.problems.leetcode.easy.MergeSortedArray;
import site.duqian.problems.leetcode.easy.MergeTwoSortedLists_Tencent;
import site.duqian.problems.leetcode.easy.NodeListDeleteDuplicates;
import site.duqian.problems.leetcode.easy.PathSum_112;
import site.duqian.problems.leetcode.easy.PlusOne66;
import site.duqian.problems.leetcode.easy.RemoveDuplicatesOfArray;
import site.duqian.problems.leetcode.easy.RemoveElement;
import site.duqian.problems.leetcode.easy.SearchInsertPosition;
import site.duqian.problems.leetcode.easy.SortedArrayToBST;
import site.duqian.problems.leetcode.easy.Sqrt_X_69;
import site.duqian.problems.leetcode.easy.SymmetricTree;
import site.duqian.problems.leetcode.easy.Tree_MaxDepth;
import site.duqian.problems.leetcode.easy.ValidPalindrome125;
import site.duqian.problems.leetcode.easy.ValidParentheses;

/**
 * Description:题库测试集
 *
 * @author 杜乾-Dusan,Created on 2017/11/28 - 17:52.
 *         E-mail:duqian2010@gmail.com
 */
public class LeetCodeTests {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void isPalindrome() throws Exception {
        ValidPalindrome125 demo = new ValidPalindrome125();
        boolean isPalindrome = demo.isPalindrome("a.");//"aba"  ""  "a."
        System.out.println("isPalindrome=" + isPalindrome);
    }

    @Test
    public void hasPathSum() throws Exception {
        PathSum_112 demo = new PathSum_112();
        TreeNode root = getTreeNode();
        boolean hasPathSum = demo.hasPathSum(root, 5);
        System.out.println("hasPathSum=" + hasPathSum);
    }

    @Test
    public void isBalanced() throws Exception {
        IsHeightBalancedTree demo = new IsHeightBalancedTree();
        TreeNode root = getTreeNode();
        boolean balanced = demo.isBalanced(root);
        System.out.println("isBalanced=" + balanced);
    }

    private TreeNode getTreeNode() {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        root.left = node2;
        node2.left = node1;
        root.right = node4;
        return root;
    }

    @Test
    public void sortedArrayToBST() throws Exception {
        SortedArrayToBST demo = new SortedArrayToBST();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        TreeNode node = demo.sortedArrayToBST(nums);
        demo.printTree(node);
    }

    @Test
    public void levelOrderBottom() throws Exception {
        LevelOrderBottom demo = new LevelOrderBottom();
        //[3,9,20,null,null,15,7],
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;
        List<List<Integer>> lists = demo.levelOrderBottom(node1);
        for (int i = 0; i < lists.size(); i++) {
            List<Integer> list = lists.get(i);
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j) + " ");
            }
            System.out.println("\n--");
        }
    }

    @Test
    public void maxDepth() throws Exception {
        Tree_MaxDepth demo = new Tree_MaxDepth();
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);
        root1.left = root2;
        root1.right = root3;
        root3.right = root4;
        int depth = demo.maxDepth(root1);
        System.out.println("depth=" + depth);
    }

    @Test
    public void isSymmetric() throws Exception {
        SymmetricTree demo = new SymmetricTree();
        //[1,2,2,3,4,4,3]
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(3);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        boolean isSymmetric = demo.isSymmetric(node1);
        System.out.println("isSymmetric=" + isSymmetric);
    }

    @Test
    public void isSameTree() throws Exception {
        IsSameTree demo = new IsSameTree();
        TreeNode p = new TreeNode(1);
        TreeNode pl = new TreeNode(2);
        TreeNode pr = new TreeNode(3);
        p.left = pl;
        p.right = pr;

        TreeNode q = new TreeNode(1);
        TreeNode ql = new TreeNode(2);
        TreeNode qr = new TreeNode(13);
        q.left = ql;
        q.right = qr;
        boolean sameTree = demo.isSameTree(p, q);
        System.out.println("isSameTree=" + sameTree);
    }

    @Test
    public void mergeSortedArray() throws Exception {
        MergeSortedArray demo = new MergeSortedArray();
        int[] aa = new int[]{1, 4, 10, 21, 34, 43, 56};
        int[] bb = new int[]{2, 5, 9};
        demo.merge(aa, 3, bb, 3);

        for (int i = 0; i < aa.length; i++) {
            System.out.println(" " + aa[i]);
        }
    }

    @Test
    public void deleteDuplicates() throws Exception {
        NodeListDeleteDuplicates demo = new NodeListDeleteDuplicates();
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(1);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        NodeListDeleteDuplicates.printListNode(head);
        System.out.println("---------------");

        ListNode node = demo.deleteDuplicates(head);
        NodeListDeleteDuplicates.printListNode(node);
    }

    @Test
    public void climbStairs() throws Exception {
        ClimbStairs demo = new ClimbStairs();
        System.out.println("result  1 =" + demo.climbStairs(1));
        System.out.println("result  2 =" + demo.climbStairs(2));
        System.out.println("result  3 =" + demo.climbStairs(3));
        System.out.println("result  4 =" + demo.climbStairs(4));
        System.out.println("result  5 =" + demo.climbStairs(5));
        System.out.println("result2 6 =" + demo.climbStairs2(6));
        System.out.println("result 15 =" + demo.climbStairs(15));
    }

    @Test
    public void mySqrt() throws Exception {
        Sqrt_X_69 demo = new Sqrt_X_69();
        System.out.println("result=" + demo.mySqrt(4));
        System.out.println("result=" + demo.mySqrt(16));
        System.out.println("result=" + demo.mySqrt(15));
        System.out.println("result=" + demo.mySqrt(26));
    }

    @Test
    public void addBinary() throws Exception {
        BinaryAdd67 demo = new BinaryAdd67();
        System.out.println("binary string =" + demo.addBinary("11", "1"));
        System.out.println("binary string =" + demo.addBinary("110", "10"));
        System.out.println("binary string =" + demo.addBinary("1111", "1111"));
    }

    @Test
    public void plusOne66() throws Exception {
        PlusOne66 demo = new PlusOne66();
        int[] nums = new int[]{9, 9, 9, 9, 9};
        int[] ints = demo.plusOne(nums);
        for (int i = 0; i < ints.length; i++) {
            System.out.println("ints = " + i + "=" + ints[i]);
        }
    }

    @Test
    public void lengthOfLastWord() throws Exception {
        LengthOfLastWord58 demo = new LengthOfLastWord58();
        int len = demo.lengthOfLastWord("abcde ");//5
        System.out.println("lengthOfLastWord = " + len);
        int len2 = demo.lengthOfLastWord("abc defg");//4
        System.out.println("lengthOfLastWord = " + len2);
        int len3 = demo.lengthOfLastWord("    ");//0
        System.out.println("lengthOfLastWord = " + len3);
        int len4 = demo.lengthOfLastWord("  a  ");//1
        System.out.println("lengthOfLastWord = " + len4);

    }

    @Test
    public void maxSubArray() throws Exception {
        MaximumSubarray53 demo = new MaximumSubarray53();
        int[] nums = new int[]{-10, 1, 2, -1, 3};

        int maxSubArray = demo.maxSubArray(nums);
        System.out.println("maxSubArray = " + maxSubArray);
    }

    @Test
    public void countAndSay() throws Exception {
        CountAndSay38 demo = new CountAndSay38();
        String countAndSay6 = demo.countAndSay(6);
        String countAndSay = demo.countAndSay(5);
        System.out.println("countAndSay 6= " + countAndSay6);
        System.out.println("countAndSay 5= " + countAndSay);
    }

    @Test
    public void searchInsert() throws Exception {
        SearchInsertPosition demo = new SearchInsertPosition();
        int[] nums = new int[]{1, 1, 2, 4, 13};
        int index = demo.searchInsert(nums, 2);
        int index1 = demo.searchInsert(nums, 1);
        int index2 = demo.searchInsert(nums, 15);
        System.out.println("num index = " + index + "," + index1 + "," + index2);
    }

    @Test
    public void strStr() throws Exception {
        ImplementStr demo = new ImplementStr();
        int index = demo.strStr("hello", "ll");
        System.out.println("str index = " + index);
    }

    @Test
    public void removeElement() throws Exception {
        RemoveElement demo = new RemoveElement();
        int[] nums = new int[]{1, 1, 13, 2, 4};
        int len = demo.removeElement(nums, 1);
        System.out.println("len = " + len);
    }

    @Test
    public void removeDuplicates() throws Exception {
        RemoveDuplicatesOfArray demo = new RemoveDuplicatesOfArray();
        int[] nums = new int[]{1, 1, 13, 2, 4};
        int len = demo.removeDuplicates(nums);
        System.out.println("len = " + len);
    }

    @Test//死循环

    public void mergeTwoLists() throws Exception {
        MergeTwoSortedLists_Tencent instance = new MergeTwoSortedLists_Tencent();
        ListNode l1 = new ListNode(1);
        ListNode l1_2 = new ListNode(3);
        ListNode l1_3 = new ListNode(5);
        l1.next = l1_2;
        l1_2.next = l1_3;

        ListNode l2 = new ListNode(2);
        ListNode l2_2 = new ListNode(4);
        ListNode l2_3 = new ListNode(6);
        l2.next = l2_2;
        l2_2.next = l2_3;

        ListNode listNode = instance.mergeTwoLists(l1, l2);

        System.out.println("node = " + listNode.val);
        ListNode p = listNode.next;
        while (p != null) {
            System.out.println("node = " + p.val);
            p = p.next;
        }
    }

    @Test
    public void isValidParentheses() throws Exception {
        ValidParentheses validParentheses = new ValidParentheses();
        boolean valid1 = validParentheses.isValidParentheses("23()oiq{adfhohf}asiodjfid");
        boolean valid2 = validParentheses.isValidParentheses("{90}");
        boolean valid3 = validParentheses.isValidParentheses("{(90})");
        System.out.println(valid1 + "/" + valid2 + "/" + valid3);
    }

}
