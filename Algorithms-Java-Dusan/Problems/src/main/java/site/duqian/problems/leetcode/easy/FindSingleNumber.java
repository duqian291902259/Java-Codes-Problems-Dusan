package site.duqian.problems.leetcode.easy;

/**
 * Description:Given an array of integers,
 * every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity.
 * Could you implement it without using extra memory?
 * <p>
 * 异或这个运算有三个很重要的特性：
 * 1，两个相同的数异或后为0；
 * 2，0和一个数异或后为那个数；
 * 3，异或运算满足交换律。
 * <p>
 * 那么我们用0去依次和数组中的数进行异或，结果再继续和下一个数异或，一遍下来，
 * 每个数字都异或到了，交换律一遍，就是让每两个相同的数字都自己跟自己异或，结果都是0，
 * 然后0和那个单独的数字异或，结果就是那个单独的数字！拍案叫绝！
 *
 * @author 杜乾-Dusan,Created on 2018/1/31 - 10:01.
 *         E-mail:duqian2010@gmail.com
 */
public class FindSingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
