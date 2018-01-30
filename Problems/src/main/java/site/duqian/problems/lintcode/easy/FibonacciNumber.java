package site.duqian.problems.lintcode.easy;

/**
 * Description:
 * 查找斐波纳契数列中第 N 个数。
 * <p>
 * 所谓的斐波纳契数列是指：
 * <p>
 * 前2个数是 0 和 1 。
 * 第 i 个数是第 i-1 个数和第i-2 个数的和。
 * 斐波纳契数列的前10个数字是：
 * <p>
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
 * <p>
 * 注意事项
 * <p>
 * The Nth fibonacci number won't exceed the max value of signed 32-bit integer in the test cases.
 *
 * @author 杜乾-Dusan,Created on 2017/11/27 - 15:12.
 *         E-mail:duqian2010@gmail.com
 */
public class FibonacciNumber {
    /**
    * @param n: an integer
    * @return: an ineger f(n)
    */
    public int fibonacci(int n) {
        // write your code here
        if (n == 1) {
            return 0;
        } else if (n == 2 || n == 3) {
            return 1;
        } else {
            int[] fibonacciArray = new int[n];
            //fibonacciArray[i]表示第i个斐波那契数
            fibonacciArray[0] = 0;
            fibonacciArray[1] = 1;
            fibonacciArray[2] = 1;
            for (int i = 3; i < n; i++) {
                //注意由于fibonacciArray[0]表示第1个元素，这里是i<n
                fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
            }
            long value = fibonacciArray[n - 1];
            if (value >= Integer.MAX_VALUE) {
                throw new RuntimeException("超出整数范围");
            }
            return (int) value;
        }
    }
}
