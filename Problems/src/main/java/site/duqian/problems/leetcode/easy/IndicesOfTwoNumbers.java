package site.duqian.problems.leetcode.easy;

/**
 * Description:两数字相加为目标值，返回两数字的索引
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * @author 杜乾-Dusan,Created on 2017/11/27 - 20:54.
 *         E-mail:duqian2010@gmail.com
 */
public class IndicesOfTwoNumbers {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            return null;
        }
        if (nums.length == 0) {
            return null;
        }
        int values[] = new int[2];
        int len = nums.length;
        boolean hasFound = false;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    values[0] = i;
                    values[1] = j;
                    hasFound = true;
                    break;
                }
            }
        }
        if (!hasFound) {
            return null;
        }
        return values;
    }
}
