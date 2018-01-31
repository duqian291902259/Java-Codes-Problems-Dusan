package site.duqian.problems.lintcode.easy;

/**
 * Description:比较两个字符串A和B，确定A中是否包含B中所有的字符。
 * 字符串A和B中的字符都是 大写字母
 * 在 A 中出现的 B 字符串里的字符不需要连续或者有序。只要包含就可以，太简单了
 * 给出 A = "ABCD" B = "ACD"，返回 true
 * 给出 A = "ABCD" B = "AABC"， 返回 false
 * "ABCDE", "DB" true
 *
 * @author 杜乾-Dusan,Created on 2017/12/27 - 11:08.
 *         E-mail:duqian2010@gmail.com
 */
public class CompareStrings {
    /**
     * @param A: A string
     * @param B: A string
     * @return if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        if (A == null || B == null) {
            return false;
        }
        int lenA = A.length();
        int lenB = B.length();
        if (lenA < lenB) {
            return false;
        }
        for (int i = 0; i < lenB; i++) {
            char charB = B.charAt(i);
            int index = A.indexOf(charB);
            if (index == -1) {
                return false;
            } else {
                if (i + 1 <= lenB) {
                    String subA = A.replaceFirst(String.valueOf(charB), "");
                    String subB = B.substring(i + 1);
                    return compareStrings(subA, subB);
                }
            }
        }
        return true;
    }

    public boolean compareStrings2(String A, String B) {
        // write your code here
        if (A == null || B == null) {
            return false;
        }
        int lenA = A.length();
        int lenB = B.length();
        if (lenA < lenB) {
            return false;
        }
        for (int i = 0; i < lenB; i++) {
            char charB = B.charAt(i);
            int index = A.indexOf(charB);
            if (index == -1) {
                return false;
            } else {
                if (index + 1 <= lenA && i + 1 <= lenB) {
                    String subA = A.substring(index + 1);
                    String subB = B.substring(i + 1);
                    return compareStrings2(subA, subB);
                }
            }
        }
        return true;
    }
}
