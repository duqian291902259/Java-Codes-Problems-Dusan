package site.duqian.problems.leetcode.easy;

/**
 * Description:
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * <p>
 * You may assume no duplicates in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,3,5,6], 5
 * Output: 2
 * Example 2:
 * <p>
 * Input: [1,3,5,6], 2
 * Output: 1
 * Example 3:
 * <p>
 * Input: [1,3,5,6], 7
 * Output: 4
 * Example 1:
 * <p>
 * Input: [1,3,5,6], 0
 * Output: 0
 *
 * @author 杜乾-Dusan,Created on 2017/12/7 - 15:44.
 *         E-mail:duqian2010@gmail.com
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int index = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int num = nums[i];
            if (num == target) {
                index = i;
                break;
            } else if (target > num) {
                index = i + 1;
            }
        }
        return index;
    }
}
