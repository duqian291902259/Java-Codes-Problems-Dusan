package site.duqian.problems.lintcode.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description:
 * 给定一个整型数组，找出主元素，它在数组中的出现次数严格大于数组元素个数的二分之一。
 * You may assume that the array is non-empty and the majority number always exist in the array.
 * 给出数组[1,1,1,1,2,2,2]，返回 1
 * 要求时间复杂度为O(n)，空间复杂度为O(1)
 * <p>
 * 剪裁数组:核心的思路在于 当一个数组去掉两个不同的元素时，其主元素不改变 。
 * 两个不相等的元素只有两种可能，两种情况分别为 去掉两个非主元素 和 去掉一个主元素和一个非主元素，
 * 无论如何主元素比例都不小于去掉之前。所以从头开始遍历，只要凑成 n 对不相等元素就可以裁剪掉前面的部分。
 *
 * @author 杜乾-Dusan,Created on 2017/12/22 - 10:50.
 *         E-mail:duqian2010@gmail.com
 */
public class MajorityNumber {
    /**
     * 应用hashMap来实现
     *
     * @param nums: a list of integers
     * @return find a  majority number
     */
    public int majorityNumber(List<Integer> nums) {
        // write your code here
        if (nums == null || nums.size() == 0) {
            return 0;
        }
        int majority = 0;
        int size = nums.size();
        int count = 0;
        for (int i = 0; i < size; i++) {
            int num = nums.get(i);
            if (count == 0) {
                majority = num;
            }
            if (num == majority) {
                count++;
            } else {
                count--;
            }
        }
        return majority;
    }

    public int majorityNumber1(List<Integer> nums) {
        // write your code here
        if (nums == null || nums.size() == 0) {
            return 0;
        }
        int majority = 0;
        int size = nums.size();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            int key = nums.get(i);
            if (map.containsKey(key)) {
                int value = map.get(key) + 1;
                map.put(key, value);
                if (value >= size / 2) {
                    majority = key;
                    break;
                }
            } else {
                map.put(key, 1);
            }
        }
        return majority;
    }
}
