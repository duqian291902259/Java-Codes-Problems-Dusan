package site.duqian.problems.leetcode.easy;

/**
 * Description:Given an array and a value, remove all instances of that value in-place
 * and return the new length.
 * Do not allocate extra space for another array,
 * you must do this by modifying the input array in-place with O(1) extra memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * Example:
 * Given nums = [3,2,2,3], val = 3,
 * Your function should return length = 2, with the first two elements of nums being 2.
 *
 * @author 杜乾-Dusan,Created on 2017/12/5 - 12:28.
 *         E-mail:duqian2010@gmail.com
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int index = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
