package site.duqian.problems.lintcode.easy;

/**
 * Description:对于一个给定的 source 字符串和一个 target 字符串，
 * 你应该在 source 字符串中找出 target 字符串出现的第一个位置(从0开始)。如果不存在，则返回 -1。
 *
 * @author 杜乾-Dusan,Created on 2017/12/11 - 00:18.
 *         E-mail:duqian2010@gmail.com
 */
public class FindIndexOfSubString {
    /**
     * @param source: source string to be scanned.
     * @param target: target string containing the sequence of characters to match
     * @return: a index to the first occurrence of target in source, or -1  if target is not part of source.
     */
    public int strStr(String source, String target) {
        // write your code here
        if (target == "") {
            return 0;
        }
        int result = -1;
        if (source == null || source.length() == 0) {
            return result;
        }
        if (target == null || target.length() == 0) {
            return result;
        }
        int lenS = source.length();
        int lenT = target.length();
        if (lenT > lenS) {
            return result;
        }
        char firstT = target.charAt(0);
        for (int i = 0; i < lenS; i++) {
            char curSourceChar = source.charAt(i);
            if (curSourceChar == firstT && i + lenT <= lenS) {
                int count = 1;
                for (int j = 1; j < lenT; j++) {
                    char schar = source.charAt(i + j);
                    char tchar = target.charAt(j);
                    if (schar == tchar) {
                        count++;
                    }
                }
                if (count == lenT) {
                    return i;
                }
            }
        }
        return result;
    }

    public int strStr2(String source, String target) {
        // write your code here
        if (source == null || target == null) {
            return -1;
        }
        return source.indexOf(target);
    }
}
