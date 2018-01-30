package site.duqian.problems.leetcode.easy;

/**
 * Description:二进制相加，返回字符串形式的值
 * <p>
 * Given two binary strings, return their sum (also a binary string).
 * <p>
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 *
 * @author 杜乾-Dusan,Created on 2017/12/13 - 20:51.
 *         E-mail:duqian2010@gmail.com
 */
public class BinaryAdd67 {
    public String addBinary(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        int maxLen = lenA > lenB ? lenA : lenB;
        int carry = 0;//进位
        //it will be faster
        StringBuilder sb = new StringBuilder();
        //循环取两字符串最后一位相加，如果没有则为0，记录相加后的末尾和进位
        for (int i = 0; i < maxLen; i++) {
            int intA = lenA > i ? a.charAt(lenA - 1 - i) - '0' : 0;
            int intB = lenB > i ? b.charAt(lenB - 1 - i) - '0' : 0;
            int sum = intA + intB + carry;
            int last = sum % 2;//尾数
            sb.insert(0, last);
            carry = sum > 1 ? 1 : 0;
        }
        if (carry == 1) {
            sb.insert(0, 1);
        }
        return sb.toString();
    }
}
