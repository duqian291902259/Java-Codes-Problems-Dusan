package site.duqian.problems.leetcode.easy;

/**
 * Description:
 * Given two sorted integer arrays nums1 and nums2,
 * merge nums2 into nums1 as one sorted array.
 * <p>
 * You may assume that nums1 has enough space (size that is greater or equal to m + n)
 * to hold additional elements from nums2.
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 *
 * @author 杜乾-Dusan,Created on 2017/12/20 - 17:56.
 *         E-mail:duqian2010@gmail.com
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums2 == null) {
            return;
        }
        int index1 = m - 1;
        if (m == 0) {
            index1 = 0;
        }
        int index2 = n - 1;
        int len = m + n - 1;
        while (index1 >= 0 && index2 >= 0) {
            int num1 = nums1[index1];
            int num2 = nums2[index2];
            if (num1 >= num2) {
                nums1[len--] = num1;
                index1--;
            } else {
                nums1[len--] = num2;
                index2--;
            }

        }
        //一定要是index2，如果[0],0,[1],1-->[1]
        while (index2 >= 0) {
            nums1[len--] = nums2[index2--];
        }
    }
}
