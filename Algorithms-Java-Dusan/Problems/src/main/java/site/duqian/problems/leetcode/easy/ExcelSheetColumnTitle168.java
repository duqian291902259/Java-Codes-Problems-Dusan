package site.duqian.problems.leetcode.easy;

/**
 * Description:Given a positive integer,
 * return its corresponding column title as appear in an Excel sheet.
 * 1 -> A ,2 -> B , 3 -> C
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 * 思路：
 * <p>
 * 我们找一下规律，一个字母的有26列，两个字母的从AA到ZZ总共有26*26列，三个字母的总共有26*26*26列。
 * 给出的数字对26取余数得到的数字，就是列标题的最后一个字母的序号。
 * 将给出的数字除以26，再取余，就可以得到倒数第二位的字母序号，一直到什么时候为止呢，到除以26为0打止，
 * 这时候已经没有更高位的字母了。
 * <p>
 * 其实可以理解为将一个十进制的数字转换成一个26进制的数字，跟转换成二进制是一个道理。
 * <p>
 * 注意我们要得到数字需要使用ASCII对应的数字来进行转换，A对应的码是65，所以我们每次转换时都要将余数+65来转换成字符，
 * 但是如果是对应的Z，其实除以26是没有余数的，因此在每次取余之前，都要将n减一。
 * <p>
 * 同样的，在字符串拼接时使用 + 拼接是很慢的，换成StringBuffer来拼接会快很多。
 *
 * @author 杜乾-Dusan,Created on 2018/3/27 - 20:21.
 *         E-mail:duqian2010@gmail.com
 */
public class ExcelSheetColumnTitle168 {
    public String convertToTitle(int n) {
        StringBuffer result = new StringBuffer();
        while (n > 0) {
            n--;
            String last = String.valueOf((char) (n % 26 + 65));
            result.append(last);
            n = n / 26;
        }
        return result.reverse().toString();
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
