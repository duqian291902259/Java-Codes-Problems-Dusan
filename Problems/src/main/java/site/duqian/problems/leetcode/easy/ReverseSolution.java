package site.duqian.problems.leetcode.easy;

/**
 * ReverseSolution:整型数字反转，如：-123 --> -321，3466 --> 6643
 *
 * @author Nonolive-杜乾 Created on 2017/11/27 - 10:04.
 *         E-mail:dusan.du@nonolive.com
 */
public class ReverseSolution {
    public static int reverse(int x) {
        if (x == 0) {
            return 0;
        } else if (x > 0) {
            String str = String.valueOf(x);
            char[] intChar = str.toCharArray();
            int len = intChar.length;
            char[] reverseChar = new char[len];
            for (int i = 0; i < len; i++) {
                reverseChar[i] = intChar[len - 1 - i];
            }
            long result = Long.parseLong(new String(reverseChar));
            if (result > Integer.MAX_VALUE) {
                return 0;
            }
            return (int) result;
        } else {
            String str = String.valueOf(x);
            char[] intChar = str.toCharArray();
            int len = intChar.length;
            char[] reverseChar = new char[len];
            reverseChar[0] = '-';
            for (int i = 1; i < len; i++) {
                reverseChar[i] = intChar[len - i];
            }
            long result = Long.parseLong(new String(reverseChar));
            if (result < Integer.MIN_VALUE) {
                return 0;
            }
            return (int) result;
        }
    }

    public static int reverse2(int x) {
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

    public static void main(String[] args) {
        System.out.println("test " + reverse2(-123));
    }
}
