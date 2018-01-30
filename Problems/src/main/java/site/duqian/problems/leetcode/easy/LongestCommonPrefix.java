package site.duqian.problems.leetcode.easy;

/**
 * Description:获取字符串数组中最大前缀
 * Write a function to find the longest common prefix string amongst an array of strings.
 * "abcdefg"
 * "abcdefghijk"
 * "abcdfghijk"
 * "abcef"
 * <p>
 * 上面的字符串数组的最长公共前缀就是"abc"。
 *
 * @author 杜乾-Dusan,Created on 2017/11/28 - 18:11.
 *         E-mail:duqian2010@gmail.com
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int length = strs.length;
        String shortest = getShortestString(strs, length);
        String result = "";
        for (int i = shortest.length(); i > 0; i--) {
            String temp = shortest.substring(0, i);
            System.out.println("temp=" + temp);
            int countSame = 0;
            for (int j = 0; j < length; j++) {
                String str = strs[j];
                //是否包含字串
                boolean contains = str.startsWith(temp);
                if (contains) {
                    countSame++;
                }
            }
            if (countSame == length) {
                result = temp;
                break;
            }
        }
        return result;
    }

    private String getShortestString(String[] strs, int length) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int minLength = strs[0].length();
        String shortest = "";
        for (int i = 0; i < length; i++) {
            int strLen = strs[i].length();
            if (strLen <= minLength) {
                minLength = strLen;
                shortest = strs[i];
                System.out.println("shortest=" + shortest);
            }
        }
        return shortest;
    }
}
