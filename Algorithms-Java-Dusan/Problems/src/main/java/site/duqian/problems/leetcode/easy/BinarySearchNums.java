package site.duqian.problems.leetcode.easy;

/**
 * Description:在一个排序数组中找一个数，返回该数出现的任意位置，如果不存在，返回-1
 * 样例
 * 给出数组 [1, 2, 2, 4, 5, 5].
 * <p>
 * 对于 target = 2, 返回 1 或者 2.
 * 对于 target = 5, 返回 4 或者 5.
 * 对于 target = 6, 返回 -1.
 * 挑战
 * O(logn) 的时间
 *
 * @author 杜乾-Dusan,Created on 2017/12/1 - 10:10.
 *         E-mail:duqian2010@gmail.com
 */
public class BinarySearchNums {


    /**
     * @param nums:   An integer array sorted in ascending order
     * @param target: An integer
     * @return: An integer
     */
    public int findPosition(int[] nums, int target) {
        // write your code here
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int len = nums.length;
        int start = 0;
        int end = len - 1;
        while (start <= end) {
            int mid = (end - start) / 2 + start;
            int midValue = nums[mid];
            if (midValue == target) {
                return mid;
            } else if (target > midValue) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
