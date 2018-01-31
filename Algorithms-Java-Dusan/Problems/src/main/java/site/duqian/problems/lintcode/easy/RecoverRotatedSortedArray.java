package site.duqian.problems.lintcode.easy;

import java.util.List;

/**
 * Description:给定一个旋转排序数组，在原地恢复其排序。
 * 什么是旋转数组？
 * 比如，原始数组为[1,2,3,4], 则其旋转数组可以是[1,2,3,4], [2,3,4,1], [3,4,1,2], [4,1,2,3]
 * 样例
 * [4, 5, 1, 2, 3] -> [1, 2, 3, 4, 5]
 * 使用O(1)的额外空间和O(n)时间复杂度
 *
 * @author 杜乾-Dusan,Created on 2017/12/20 - 17:29.
 *         E-mail:duqian2010@gmail.com
 */
public class RecoverRotatedSortedArray {
    /**
     * @param nums: An integer array
     * @return: nothing
     */
    public void recoverRotatedSortedArray(List<Integer> nums) {
        // write your code here
        if (nums == null) {
            return;
        }
        //find min
        int size = nums.size();
        int min = nums.get(0);
        int i = 0;
        for (i = 0; i < size; i++) {
            int integer = nums.get(i);
            if (integer < min) {
                min = integer;
                break;
            }
        }
        //add to last
        for (int j = 0; j < i; j++) {
            nums.add(nums.get(j));
        }
        //nums.removeAll(nums.subList(0, i));
        nums.subList(0,i).clear();
    }
}
