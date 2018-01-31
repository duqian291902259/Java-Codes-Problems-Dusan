package site.duqian.problems.leetcode.easy;

/**
 * Description: Implement strStr().
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 * <p>
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 *
 * @author 杜乾-Dusan,Created on 2017/12/7 - 15:26.
 *         E-mail:duqian2010@gmail.com
 */
public class ImplementStr {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        return haystack.indexOf(needle);
    }

}
