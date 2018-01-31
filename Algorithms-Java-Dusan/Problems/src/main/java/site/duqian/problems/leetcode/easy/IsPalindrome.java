package site.duqian.problems.leetcode.easy;

/**
 * Description:Determine whether an integer is a palindrome. Do this without extra space.
 *
 * @author 杜乾-Dusan,Created on 2017/11/27 - 14:41.
 *         E-mail:duqian2010@gmail.com
 */
public class IsPalindrome {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        return x == reverse(x);
    }

    public static int reverse(int x) {
        int flag = x > 0 ? 1 : -1;
        if (x <= Integer.MIN_VALUE) {
            return 0;
        }

        x = Math.abs(x);
        long result = 0;
        while (x > 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        if (result > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int) result * flag;
        }
    }
}
