package site.duqian.problems.leetcode.easy;

/**
 * Description:
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
 * return the length of last word in the string.
 * If the last word does not exist, return 0.
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * Example:
 * Input: "Hello World"
 * Output: 5
 * <p>
 * 边界情况："   "=0 ，"  a  "=1,"adfad "=5,"  sfr"=3
 *
 * @author 杜乾-Dusan,Created on 2017/12/13 - 10:55.
 *         E-mail:duqian2010@gmail.com
 */
public class LengthOfLastWord58 {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int length = s.length();
        int index = s.lastIndexOf(" ");
        if (index != -1) {
            //如果index是最后一位，是空格，则递归调用，否则返回index前面字符串的长度
            if (index == length - 1) {
                length = lengthOfLastWord(s.substring(0, index));
            } else {
                //取空格后面的长度
                length = length - index - 1;
            }
        }
        return length;
    }
}
