package site.duqian.problems.leetcode.easy;

/**
 * Description:
 * Find the contiguous subarray within an array (containing at least one number)
 * which has the largest sum.
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 * More practice:
 * If you have figured out the O(n) solution, try coding another solution
 * using the divide and conquer approach, which is more subtle.
 *
 * @author 杜乾-Dusan,Created on 2017/12/11 - 15:52.
 *         E-mail:duqian2010@gmail.com
 */
public class MaximumSubarray53 {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        int countSum = 0;
        for (int i = 0; i < len; i++) {
            int curNum = nums[i];
            if (countSum >= 0) {
                countSum += curNum;
            } else {
                countSum = curNum;
            }
            max = Math.max(max, countSum);
        }
        return max;
    }
}
