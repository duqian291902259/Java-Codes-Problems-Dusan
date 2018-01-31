package site.duqian.problems.easy;

import org.junit.Before;
import org.junit.Test;

import site.duqian.problems.ListNode;
import site.duqian.problems.TreeNode;
import site.duqian.problems.leetcode.easy.BinarySearchNums;
import site.duqian.problems.leetcode.easy.IsPalindrome;
import site.duqian.problems.leetcode.easy.ListNodeRemoveNums;
import site.duqian.problems.leetcode.easy.LongestCommonPrefix;
import site.duqian.problems.leetcode.easy.Roman2Integer;
import site.duqian.problems.lintcode.easy.ListNodeCounts;
import site.duqian.problems.lintcode.easy.MaxOfBinaryTreeNode;

import static org.junit.Assert.assertEquals;

/**
 * Description:题库测试集
 *
 * @author 杜乾-Dusan,Created on 2017/11/28 - 17:52.
 *         E-mail:duqian2010@gmail.com
 */
public class EasyProblemsTests {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findPostion() throws Exception {
        int[] nums = new int[]{1, 2, 2, 4, 5, 5};
        BinarySearchNums binarySearchNums = new BinarySearchNums();
        int p0 = binarySearchNums.findPosition(nums, 1);
        int p1 = binarySearchNums.findPosition(nums, 2);
        int p2 = binarySearchNums.findPosition(nums,4);
        int p3 = binarySearchNums.findPosition(nums,5);
        System.out.println("p0=" + p0);
        System.out.println("p1=" + p1);
        System.out.println("p2=" + p2);
        System.out.println("p3=" + p3);
    }


    @Test
    public void maxNode() throws Exception {
        TreeNode node1 = new TreeNode(-1);
        TreeNode node2 = new TreeNode(-5);
        TreeNode node3 = new TreeNode(-1);
        TreeNode node4 = new TreeNode(-2);
        node1.left = node3;
        node1.right = node2;
        node2.right = node4;
        System.out.println("max node=" + new MaxOfBinaryTreeNode().maxNode(node1).val);
    }


    @Test
    public void longestCommonPrefix() throws Exception {
        //String strs[] = new String[]{"abcdefg", "abcdefghijk", "abcdfghijk", "abcef"};
        //String strs[] = new String[]{"a"};
        String strs[] = new String[]{"ca", "a"};
        String result = new LongestCommonPrefix().longestCommonPrefix(strs);
        System.out.println("common prefix str =" + result);
    }

    @Test
    public void isPalindrome() throws Exception {
        boolean palindrome = new IsPalindrome().isPalindrome(-2147447412);
        System.out.println("is palindrome =" + palindrome);
        assertEquals(false, palindrome);
    }

    @Test
    public void testCountNode() throws Exception {
        //1->2->3->3->4->5->3
        ListNode nodeA = new ListNode(3);
        ListNode nodeB = new ListNode(2);
        ListNode nodeC = new ListNode(3);
        ListNode nodeD = new ListNode(3);
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        ListNodeCounts.printListNode(nodeA);

        ListNodeCounts instance = new ListNodeCounts();
        int countNodes = instance.countNodes(nodeA);
        System.out.println("nums = " + countNodes);

    }

    @Test(timeout = 1)
    public void romanToInt() throws Exception {
        Roman2Integer instance = new Roman2Integer();
        assertEquals(800, instance.romanToInt("DCCC"));
        System.out.println("romanToInt="+instance.romanToInt("DCCC"));//800=500+100+100+100
        System.out.println("romanToInt="+instance.romanToInt("LXXXVII"));//50+10+10+10+5+1+1=87
        System.out.println("romanToInt="+instance.romanToInt("XCIX"));//99
        System.out.println("romanToInt="+instance.romanToInt("LXXXIV"));//50+10+10+10-1+5=84
    }

    @Test
    public void testRemoveNode() throws Exception {
        //1->2->3->3->4->5->3
        ListNode nodeA = new ListNode(3);
        ListNode nodeB = new ListNode(2);
        ListNode nodeC = new ListNode(3);
        ListNode nodeD = new ListNode(3);
        ListNode nodeE = new ListNode(4);
        ListNode nodeF = new ListNode(5);
        ListNode nodeG = new ListNode(3);
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        nodeE.next = nodeF;
        nodeF.next = nodeG;
        //printListNode(nodeA);

        ListNodeRemoveNums instance = new ListNodeRemoveNums();
        ListNode listNode = instance.removeElements(nodeA, 3);
        if (listNode == null){
            System.out.println("node = null");
            return;
        }
        printListNode(listNode);
    }

    private void printListNode(ListNode listNode) {
        System.out.println("node = "+listNode.val);
        ListNode p = listNode.next;
        while (p != null) {
            System.out.println("node = "+p.val);
            p = p.next;
        }
    }
}
