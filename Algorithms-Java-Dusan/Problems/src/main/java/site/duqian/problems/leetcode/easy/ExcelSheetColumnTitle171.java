package site.duqian.problems.leetcode.easy;

/**
 * Description:Related to question Excel Sheet Column Title
 * <p>
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * <p>
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 *
 * @author 杜乾-Dusan,Created on 2018/3/27 - 20:21.
 *         E-mail:duqian2010@gmail.com
 */
public class ExcelSheetColumnTitle171 {

    public int titleToNumber(String s) {
        int num = 0;
        final char[] chars = s.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len; i++) {
            final char aChar = chars[i];
            final int currentNum = aChar - 65 + 1;
            num += Math.pow(26,len - i - 1) * currentNum;
        }
        return num;
    }

    public String convertToTitle2(int n) {
        String result = "";
        while (n > 0) {
            n--;
            result = String.valueOf((char) (n % 26 + 65)) + result;
            n = n / 26;
        }
        return result;
    }
}
