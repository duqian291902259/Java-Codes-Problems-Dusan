package site.duqian.problems.lintcode.easy;

/**
 * Description:给定一个未排序的整数数组，找到其中位数。
 * <p>
 * 中位数是排序后数组的中间值，如果数组的个数是偶数个，则返回排序后数组的第N/2个数。
 * 给出数组[4, 5, 1, 2, 3]， 返回 3
 * 给出数组[7, 9, 4, 5]，返回 5
 * 时间复杂度为O(n)
 *
 * @author 杜乾-Dusan,Created on 2018/1/4 - 18:28.
 *         E-mail:duqian2010@gmail.com
 */
public class MedianNum {
    /**
     * @param : A list of integers
     * @return: An integer denotes the middle number of the array
     */
    public int median(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0) {
            return 0;
        }
        //排序
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        if (len % 2 == 0) {
            return nums[len / 2-1];//注意是角标
        } else {
            return nums[len / 2 ];
        }
    }
}
