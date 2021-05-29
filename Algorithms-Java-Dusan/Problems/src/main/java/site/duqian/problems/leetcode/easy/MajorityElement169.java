package site.duqian.problems.leetcode.easy;

import java.util.Arrays;

/**
 * Description:Given an array of size n,
 * find the majority element. The majority element is the element that
 * appears more than ⌊ n/2 ⌋ times.
 * <p>
 * You may assume that the array is non-empty and
 * the majority element always existin the array.
 *
 * @author 杜乾-Dusan,Created on 2018/3/28 - 10:25.
 *         E-mail:duqian2010@gmail.com
 */
public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int count = 0;
        int major = nums[0];
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            final int num = nums[i];
            if (count == 0) {
                major = num;
                count++;
            } else if (count > len / 2) {
                break;
            } else {
                if (major == num) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return major;
    }

    public int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

}
