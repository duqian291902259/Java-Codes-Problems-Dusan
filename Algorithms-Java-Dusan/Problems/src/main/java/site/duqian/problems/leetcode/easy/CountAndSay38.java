package site.duqian.problems.leetcode.easy;

/**
 * Description:
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 * <p>
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth term of the count-and-say sequence.
 * <p>
 * Note: Each term of the sequence of integers will be represented as a string.
 * <p>
 * <p>
 * 计数报数序列按如下规律开始递增：
 * 1，11，21，1211，111221，……
 * <p>
 * 1 读作“1个1”或11.
 * 11 读作“2个1”或21.
 * 21 读作“1个2，1个1”或1211.
 * <p>
 * 给定一个整数n，生成第n个序列。
 * <p>
 * 备注：数字序列应该用字符串表示。
 *
 * @author 杜乾-Dusan,Created on 2017/12/8 - 17:10.
 *         E-mail:duqian2010@gmail.com
 */
public class CountAndSay38 {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        } else {
            String str = countAndSay(n - 1);
            String result = "";
            int index = 0;
            int len = str.length();
            while (index < len) {
                char curNum = str.charAt(index);
                int count = 0;
                while (index < len && str.charAt(index) == curNum) {
                    count++;
                    index++;
                }
                result += count;
                result += curNum;
            }
            return result;
        }
    }
}
