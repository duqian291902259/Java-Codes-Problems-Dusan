package site.duqian.problems.leetcode.easy;

/**
 * Description:
 * Implement int sqrt(int x).
 * Compute and return the square root of x.x is guaranteed to be a non-negative integer.
 * <p>
 * Example 1:Input: 4  Output: 2
 * Example 2:Input: 8  Output: 2
 * Explanation: The square root of 8 is 2.82842...,
 * and since we want to return an integer, the decimal part will be truncated.
 *
 * 用int型会越界，用double结果不正确。why long ok？
 *
 * @author 杜乾-Dusan,Created on 2017/12/15 - 19:32.
 *         E-mail:duqian2010@gmail.com
 */
public class Sqrt_X_69 {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        long start = 0;
        long end = x / 2 + 1;
        //因为一个数的平方根一定小于这个值，从中二分查找
        while (start <= end) {
            long mid = (start + end) / 2;//相加除于2
            long num = mid * mid;
            if (num < x) {
                start = mid + 1;
            } else if (num > x) {
                end = mid - 1;
            } else {
                return (int) mid;
            }
        }
        return (int) end;
    }
}
