package site.duqian.problems.lintcode.easy;

/**
 * Description:设计一个算法，计算出n阶乘中尾部零的个数
 * 样例：11! = 39916800，因此应该返回 2
 * 如果n的值很大，将得到负数。
 * 挑战  O(logN)的时间复杂度
 *
 * 5555550000000,个数超过int最大值，如果用int型变量接收，将得到错误的结果：
 * 5555550000000！中0的len=1613063388
 * 实际上结果是：1388887499996
 *
 *
 * @author 杜乾-Dusan,Created on 2017/12/5 - 18:41.
 *         E-mail:duqian2010@gmail.com
 */
public class TrailingZeros {
    /**
     * @param n: An integer
     * @return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        System.out.println("max_int="+Integer.MAX_VALUE);
        System.out.println("max_long="+Long.MAX_VALUE);
        //统计个数要用long接收，否则会整型越界。
        long count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }

    /**
     * 求一个数的阶乘，数字大了会超出long的长度限制。
     *
     * @param n
     * @return
     */
    private long getFactorialValue(long n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * getFactorialValue(n - 1);
    }
}
