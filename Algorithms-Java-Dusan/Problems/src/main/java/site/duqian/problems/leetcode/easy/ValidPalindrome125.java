package site.duqian.problems.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:回文串
 * Given a string, determine if it is a palindrome, considering only
 * alphanumeric characters and ignoring cases.
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 * Note:
 * Have you consider that the string might be empty? This is a good question to ask during an interview.
 * For the purpose of this problem, we define empty string as valid palindrome.
 *
 * @author 杜乾-Dusan,Created on 2018/1/29 - 17:28.
 *         E-mail:duqian2010@gmail.com
 */
public class ValidPalindrome125 {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        char[] chars = s.toLowerCase().toCharArray();
        int len = chars.length;
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            char ch = chars[i];
            if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                list.add(ch);
            }
        }

        int start = 0;
        int end = list.size() - 1;
        while (start < end) {
            char c1 = list.get(start);
            char c2 = list.get(end);
            if (c1 != c2) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
