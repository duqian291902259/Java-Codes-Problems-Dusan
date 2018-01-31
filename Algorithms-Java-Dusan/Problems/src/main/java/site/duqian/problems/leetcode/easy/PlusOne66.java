package site.duqian.problems.leetcode.easy;

/**
 * Description:加1，进位
 * Given a non-negative integer represented as a non-empty array of digits,
 * plus one to the integer.
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 * The digits are stored such that the most significant digit is at the head of the list.
 *
 * @author 杜乾-Dusan,Created on 2017/12/13 - 16:30.
 *         E-mail:duqian2010@gmail.com
 */
public class PlusOne66 {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return null;
        }
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            int digit = digits[i];
            //小于9直接加1返回，否则循坏下一位判断
            if (digit < 9) {
                digits[i] = digit + 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[len + 1];
        result[0] = 1;//进位
        return result;
    }
}
