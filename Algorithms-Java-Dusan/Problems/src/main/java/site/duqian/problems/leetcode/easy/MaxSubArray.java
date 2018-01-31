package site.duqian.problems.leetcode.easy;

import java.util.List;

/**
 * Description:给定一个整数数组，找到一个具有最大和的子数组，返回其最大和。
 * 给出数组[−2,2,−3,4,−1,2,1,−5,3]，符合要求的子数组为[4,−1,2,1]，其最大和为6
 * 注意事项：子数组最少包含一个数，要求时间复杂度为O(n)
 *
 * @author 杜乾-Dusan,Created on 2017/12/22 - 10:20.
 *         E-mail:duqian2010@gmail.com
 */
public class MaxSubArray {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int len = nums.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            int num = nums[i];
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            max = Math.max(max, sum);//保存和的最大值
        }
        return max;
    }

    /**
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(List<Integer> nums) {
        // write your code here
        if (nums == null || nums.size() == 0) {
            return 0;
        }
        int len = nums.size();
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            int integer = nums.get(i);
            if (sum < 0) {
                sum += integer;
            } else {
                sum = integer;
            }
            //保存和的最小值
            min = Math.min(min, sum);
        }
        return min;
    }
}
