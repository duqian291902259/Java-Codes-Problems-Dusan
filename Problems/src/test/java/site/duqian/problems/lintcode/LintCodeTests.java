package site.duqian.problems.lintcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import site.duqian.problems.ListNode;
import site.duqian.problems.TreeNode;
import site.duqian.problems.leetcode.easy.MaxSubArray;
import site.duqian.problems.leetcode.easy.Tree_MinimumDepthOfBinaryTree;
import site.duqian.problems.lintcode.easy.BinaryAPlusB;
import site.duqian.problems.lintcode.easy.BinarySearch14;
import site.duqian.problems.lintcode.easy.CompareStrings;
import site.duqian.problems.lintcode.easy.FindIndexOfSubString;
import site.duqian.problems.lintcode.easy.FizzBuzz;
import site.duqian.problems.lintcode.easy.Flatten22;
import site.duqian.problems.lintcode.easy.InsertInterval;
import site.duqian.problems.lintcode.easy.MajorityNumber;
import site.duqian.problems.lintcode.easy.MergeSortedArray;
import site.duqian.problems.lintcode.easy.NodeListReverse;
import site.duqian.problems.lintcode.easy.ProductExcludeItself;
import site.duqian.problems.lintcode.easy.RecoverRotatedSortedArray;
import site.duqian.problems.lintcode.easy.ReverseWords;
import site.duqian.problems.lintcode.easy.RotateString;
import site.duqian.problems.lintcode.easy.SearchNumFromMatrix;
import site.duqian.problems.lintcode.easy.SingleNumber;
import site.duqian.problems.lintcode.easy.TrailingZeros;
import site.duqian.problems.lintcode.easy.TreeOrderTraversal;

/**
 * Description:题库测试集
 *
 * @author 杜乾-Dusan,Created on 2017/11/28 - 17:52.
 *         E-mail:duqian2010@gmail.com
 */
public class LintCodeTests {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void singleNumber() throws Exception {
        SingleNumber demo = new SingleNumber();
        int[] A = new int[]{1, 2, 3, 1, 2, 3, 4};
        int singleNumber = demo.singleNumber(A);
        System.out.println("single=" + singleNumber);
    }

    @Test
    public void orderTraversal() throws Exception {
        TreeOrderTraversal demo = new TreeOrderTraversal();
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        root.left = node2;
        node2.left = node1;
        root.right = node4;

        printList(demo.preorderTraversal(root));
        TreeOrderTraversal.list.clear();
        printList(demo.inorderTraversal(root));
        TreeOrderTraversal.list.clear();
        printList(demo.postorderTraversal(root));
        TreeOrderTraversal.list.clear();
    }

    private void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print("" + list.get(i));
        }
        System.out.println("\n---end----");
    }

    @Test
    public void minDepth() throws Exception {
        Tree_MinimumDepthOfBinaryTree demo = new Tree_MinimumDepthOfBinaryTree();
        TreeNode root = new TreeNode(1);
        TreeNode rootLeft = new TreeNode(2);
        TreeNode rootRight = new TreeNode(3);
        root.left = rootLeft;
        root.right = rootRight;
        int minDepth = demo.minDepth(root);
        System.out.println("minDepth=" + minDepth);
    }

    @Test
    public void compareStrings() throws Exception {
        CompareStrings demo = new CompareStrings();
        boolean compare1 = demo.compareStrings("ABCD", "ACD");
        boolean compare2 = demo.compareStrings("ABCD", "AABC");
        boolean compare3 = demo.compareStrings("ABCDE", "DB");
        System.out.println("isContains1 =" + compare1);
        System.out.println("isContains2 =" + compare2);
        System.out.println("isContains3 =" + compare3);
    }

    @Test
    public void reverseWords() throws Exception {
        ReverseWords demo = new ReverseWords();
        String reverseWords = demo.reverseWords("  hello  world ,duqian ");
        System.out.println("reverseWords=" + reverseWords);
    }

    @Test
    public void productExcludeItself() throws Exception {
        ProductExcludeItself demo = new ProductExcludeItself();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Long> longList = demo.productExcludeItself(list);
        for (int i = 0; i < longList.size(); i++) {
            System.out.println(i + " = " + longList.get(i));
        }
    }

    @Test
    public void majorityNumber() throws Exception {
        MajorityNumber demo = new MajorityNumber();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        int i = demo.majorityNumber(list);
        System.out.println("majority =" + i);
    }

    @Test
    public void maxSubArray() throws Exception {
        MaxSubArray demo = new MaxSubArray();
        int[] nums = new int[]{-2, 2, -3, 4, -1, 2, 1, -5, 3};
        int maxSum = demo.maxSubArray(nums);
        System.out.println("max=" + maxSum);//6
        List<Integer> list = new ArrayList<>();
        //给出数组[1, -1, -2, 1]，返回 -3
        list.add(1);
        list.add(-1);
        list.add(-2);
        list.add(1);
        System.out.println("min=" + demo.minSubArray(list));//-3
    }

    @Test
    public void recoverRotatedSortedArray() throws Exception {
        RecoverRotatedSortedArray demo = new RecoverRotatedSortedArray();
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        demo.recoverRotatedSortedArray(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + "=" + list.get(i));
        }
    }

    @Test
    public void reverse() throws Exception {
        NodeListReverse demo = new NodeListReverse();
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        head.next = head2;
        head2.next = head3;
        NodeListReverse.printListNode(head);
        System.out.println("------------------");
        ListNode reverse = demo.reverse(head);
        NodeListReverse.printListNode(reverse);
    }

    @Test
    public void insert() throws Exception {
        InsertInterval demo = new InsertInterval();
        InsertInterval.Interval intervalA = new InsertInterval.Interval(1, 2);
        InsertInterval.Interval intervalB = new InsertInterval.Interval(6, 8);
        InsertInterval.Interval newInterval = new InsertInterval.Interval(3, 3);
        List<InsertInterval.Interval> list = new ArrayList<>();
        list.add(intervalA);
        list.add(intervalB);
        List<InsertInterval.Interval> insert = demo.insert(list, newInterval);
        for (InsertInterval.Interval interval : insert) {
            System.out.println("interval= " + interval);
        }
    }

    @Test
    public void searchMatrix() throws Exception {
        SearchNumFromMatrix demo = new SearchNumFromMatrix();
        int[][] nums = new int[][]{{2, 4, 6, 8, 10}, {11, 19, 29, 39, 49}};
        int length = nums.length;
        int length2 = nums[0].length;
        System.out.println("length = " + length + ",len2=" + length2);
        System.out.println("length = " + demo.searchMatrix(nums, 29));


    }

    @Test
    public void flatten() throws Exception {
        Flatten22 demo = new Flatten22();
        Flatten22.NestedItem item1 = new Flatten22.NestedItem(2, null);
        Flatten22.NestedItem item2 = new Flatten22.NestedItem(23, null);
        Flatten22.NestedItem item3 = new Flatten22.NestedItem(12, null);
        Flatten22.NestedItem item4 = new Flatten22.NestedItem(20, null);
        List<Flatten22.NestedInteger> list = new ArrayList<>();
        list.add(item1);
        list.add(item2);
        List<Flatten22.NestedInteger> list2 = new ArrayList<>();
        list2.add(item3);
        list2.add(item4);

        Flatten22.NestedItem item5 = new Flatten22.NestedItem(50, list);
        Flatten22.NestedItem item6 = new Flatten22.NestedItem(90, list2);
        List<Flatten22.NestedInteger> list3 = new ArrayList<>();
        list3.add(item1);
        list3.add(item5);
        list3.add(item6);
        //list3.add(item2);
        //list3.add(item3);
        //list3.add(item4);
        List<Integer> flatten = demo.flatten(list3);
        for (Integer i : flatten) {
            System.out.println("i=" + i);
        }
    }

    @Test
    public void binarySearch() throws Exception {
        BinarySearch14 demo = new BinarySearch14();
        int[] nums = new int[]{3, 4, 5, 8, 8, 8, 8, 10, 13, 14};
        int search = demo.binarySearch(nums, 8);
        System.out.println(nums.length + ",search num postion=" + search);
    }

    @Test
    public void strStr() throws Exception {
        FindIndexOfSubString demo = new FindIndexOfSubString();
        int strStr = demo.strStr("abcdefg", "cd");
        int strStr2 = demo.strStr("abcdefg", "d");
        System.out.println("-sub string index =" + strStr);
        System.out.println("-sub string index2 =" + strStr2);
    }

    @Test
    public void fizzBuzz() throws Exception {
        FizzBuzz demo = new FizzBuzz();
        List<String> strings = demo.fizzBuzz(15);
        String[] strings1 = demo.fizzBuzz2(25);

        for (int i = 0; i < strings.size(); i++) {
            System.out.print(strings.get(i) + ",");
            System.out.println("--------------");
        }

        for (int i = 0; i < strings1.length; i++) {
            System.out.println(strings1[i] + ",");
        }
    }

    @Test
    public void rotateString() throws Exception {
        RotateString demo = new RotateString();
        char[] str = "abcdefg".toCharArray();
        System.out.println("before str= " + String.valueOf(str));
        //测试用的是同一个str，所以结果依据的是上一个结果
        demo.rotateString(str, 3);
        demo.rotateString(str, 1);
        demo.rotateString(str, 0);
        demo.rotateString(str, 10);
    }

    @Test
    public void mergeSortedArray() throws Exception {
        MergeSortedArray demo = new MergeSortedArray();
        int[] A = new int[]{1, 2, 3, 4, 5};
        int[] B = new int[]{2, 4};
        //int[] mergeSortedArray = demo.mergeSortedArray(A, B);
        //printArray(mergeSortedArray);
        demo.mergeSortedArray(A, 3, B, 2);
        printArray(A);
    }

    private void printArray(int[] a) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            System.out.println(i + "-->" + a[i]);
        }
    }

    @Test
    public void trailingZeros() throws Exception {
        TrailingZeros demo = new TrailingZeros();
        Random random = new Random();
        random.nextLong();
        long nextLong = random.nextInt(100);
        long len = demo.trailingZeros(nextLong);
        System.out.println(nextLong + "！中0的len=" + len);
        System.out.println("105！中0的len=" + demo.trailingZeros(105));
        System.out.println("5555550000000！中0的len=" + demo.trailingZeros(5555550000000L));
    }

    @Test
    public void aplusb() throws Exception {
        BinaryAPlusB plus = new BinaryAPlusB();
        int a = 2, b = 3;
        int aplusb = plus.aplusb(a, b);
        System.out.println(a + "+" + b + "=" + aplusb);
    }

}
