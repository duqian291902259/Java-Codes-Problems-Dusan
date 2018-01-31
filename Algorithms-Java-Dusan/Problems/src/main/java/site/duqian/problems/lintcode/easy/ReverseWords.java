package site.duqian.problems.lintcode.easy;

import java.util.Stack;

/**
 * Description:给定一个字符串，逐个翻转字符串中的每个单词。
 * <p>
 * 单词的构成：无空格字母构成一个单词
 * 输入字符串是否包括前导或者尾随空格？可以包括，但是反转后的字符不能包括
 * 如何处理两个单词间的多个空格？在反转字符串中间空格减少到只含一个
 *
 * @author 杜乾-Dusan,Created on 2017/12/26 - 18:40.
 *         E-mail:duqian2010@gmail.com
 */
public class ReverseWords {
    /**
     * 反转字符串中单词
     *
     * @param s: A string
     * @return: A string
     */
    public String reverseWords(String s) {
        if (s == null || "".equals(s)) {
            return s;
        }
        String regex = " ";
        String[] strings = s.split(regex);
        int len = strings.length;

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            String str = strings[i];
            if (str != null && !"".equals(str)) {
                if (i == 0) {
                    stack.push(str);
                } else {
                    stack.push(str + regex);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            String pop = stack.pop();
            System.out.println("s="+pop+",len="+pop.length());
            sb.append(pop);
        }
        return sb.toString();
    }

    /**
     * 反转字符串中每个单词的字母
     *
     * @param s: A string
     * @return: A string
     */
    public String reverseWords2(String s) {
        // write your code here
        if (s == null || "".equals(s)) {
            return s;
        }
        String regex = " ";
        String[] strings = s.split(regex);
        int len = strings.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            String str = strings[i].replaceAll(regex, "");
            if (s.equals(str)) {
                return s;
            }
            str = reverse(str);
            if (str != null && !"".equals(str)) {
                if (i == len - 1) {
                    sb.append(str);
                } else {
                    sb.append(str + regex);
                }
            }
        }
        return sb.toString();
    }

    private String reverse(String str) {
        if (str == null || "".equals(str)) {
            return null;
        }
        char[] chars = str.toCharArray();
        int len = chars.length;
        int i = 0;
        int j = len - 1;
        while (i <= j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(chars);
    }
}
