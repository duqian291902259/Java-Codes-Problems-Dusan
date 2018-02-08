package site.duqian.problems.leetcode.easy;

/**
 * Description:You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps.
 * In how many distinct ways can you climb to the top?
 * Note: Given n will be a positive integer.
 * <p>
 * Example 1:
 * Input: 2  Output:  2
 * Explanation:  There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * <p>
 * Example 2:
 * Input: 3Output:  3
 * Explanation:  There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 * <p>
 * 实际上就是爬楼梯，爬n层，有多少种爬法，每次只能一步或者两步。就是每向上走，都有两种选择。
 * <p>
 * 转化为 fibonacci数列问题，思维转换，转换成为递归求解问题
 * 每次走有两种选择，走之后又是各有两种选择，如此循环，正好是递归求解的问题。
 * 这个数列简单递归效率很低，要用动态规划来解决。
 *
 * @author 杜乾-Dusan,Created on 2017/12/19 - 17:16.
 *         E-mail:duqian2010@gmail.com
 */
public class ClimbStairs {

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    public int climbStairs2(int n) {
        if (n <= 2) {
            return n;
        }
        return climbStairs2(n - 1) + climbStairs2(n - 2);
    }
}
