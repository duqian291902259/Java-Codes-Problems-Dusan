package site.duqian.problems.lintcode.easy;

/**
 * Description:
 * 给定一个排序的整数数组（升序）和一个要查找的整数target，
 * 用O(logn)的时间查找到target第一次出现的下标（从0开始），
 * 如果target不存在于数组中，返回-1。
 * <p>
 * 在数组 [1, 2, 3, 3, 4, 5, 10] 中二分查找3，返回2。
 * 特殊场景：重复数字恰好是要查找的值，[3,4,5,8,8,8,8,10,13,14],中二分查找8，返回3。
 * <p>
 * 如果数组中的整数个数超过了2^32，你的算法是否会出错？
 *
 * @author 杜乾-Dusan,Created on 2017/12/13 - 11:51.
 *         E-mail:duqian2010@gmail.com
 */
public class BinarySearch14 {
    /**
     * @param nums:   The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        //write your code here
        if (nums == null || nums.length == 0) {
            return -1;
        }
        long len = nums.length;
        if (len > Integer.MAX_VALUE) {
            throw new RuntimeException("the length of this array is larger than Integer.MAX_VALUE");
        }
        int start = 0;
        int end = (int) len - 1;
        while (start <= end) {
            //不能忘记计算start,end,mid的位置，其中mid的角标每次都要重新计算
            int mid = (end - start) / 2 + start;
            int num = nums[mid];
            if (target > num) {
                start = mid + 1;
            } else if (target < num) {
                end = mid - 1;
            } else {
                while (mid >= 1 && nums[mid - 1] == target) {
                    mid--;
                }
                return mid;
            }
        }
        return -1;
    }
}
