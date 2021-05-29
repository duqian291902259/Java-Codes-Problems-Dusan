package site.duqian.problems.leetcode.easy;

/**
 * Description:Given an integer n, return the number of trailing zeroes in n!.
 * <p>
 * Note: Your solution should be in logarithmic time complexity.
 * <p>
 * <p>
 * n = 5: 5!的质因子中 (2 * 2 * 2 * 3 * 5)包含一个5和三个2。因而后缀0的个数是1。
 * <p>
 * n = 11: 11!的质因子中(2^8 * 3^4 * 5^2 * 7)包含两个5和三个2。于是后缀0的个数就是2。
 * <p>
 * 我们很容易观察到质因子中2的个数总是大于等于5的个数。因此只要计数5的个数就可以了。
 * n!后缀0的个数 = n!质因子中5的个数
 * = floor(n/5) + floor(n/25) + floor(n/125) + ....
 * <p>
 * <p>
 * n=25。与例1相同，计算n/5，可以得到5个5，分别来自其中的5, 10, 15, 20, 25，但是在25中其实是包含2个5的，这一点需要注意。
 * <p>
 * 所以除了计算n/5， 还要计算n/5/5, n/5/5/5, n/5/5/5/5, ..., n/5/5/5,,,/5直到商为0，然后就和，就是最后的结果。
 *
 * @author 杜乾-Dusan,Created on 2018/3/30 - 19:04.
 *         E-mail:duqian2010@gmail.com
 */
public class FactorialTrailingZeroes172 {
    public long trailingZeros(long n) {
        // write your code here
        return n / 5 == 0 ? 0 : n / 5 + trailingZeros(n / 5);
    }
}
