package site.duqian.problems.leetcode.easy;

/**
 * Description:Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * <p>
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * <p>
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * <p>
 * 二分查找
 *
 * @author 杜乾-Dusan,Created on 2018/3/26 - 20:04.
 *         E-mail:duqian2010@gmail.com
 */
public class TwoSum167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] index = new int[2];
        if (numbers == null || numbers.length == 0) {
            return null;
        }
        int len = numbers.length;
        int start = 0;
        int end = len - 1;
        while (start <= end) {
            int midValue = numbers[start] + numbers[end];
            if (target == midValue) {
                index[0] = start + 1;
                index[1] = end + 1;
                break;
            } else if (target > midValue) {
                start++;
            } else {
                end--;
            }
        }
        return index;
    }
}
