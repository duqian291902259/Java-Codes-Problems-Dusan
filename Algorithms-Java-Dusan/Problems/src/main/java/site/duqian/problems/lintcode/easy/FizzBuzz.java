package site.duqian.problems.lintcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:给你一个整数n. 从 1 到 n 按照下面的规则打印每个数：
 * <p>
 * 如果这个数被3整除，打印fizz.
 * 如果这个数被5整除，打印buzz.
 * 如果这个数能同时被3和5整除，打印fizz buzz.
 * 比如 n = 15, 返回一个字符串数组：
 * <p>
 * [
 * "1", "2", "fizz",
 * "4", "buzz", "fizz",
 * "7", "8", "fizz",
 * "buzz", "11", "fizz",
 * "13", "14", "fizz buzz"
 * ]
 *
 * @author 杜乾-Dusan,Created on 2017/12/8 - 16:55.
 *         E-mail:duqian2010@gmail.com
 */
public class FizzBuzz {
    /**
     * @param n: An integer
     * @return: A list of strings.
     */
    public List<String> fizzBuzz(int n) {
        // write your code here
        ArrayList<String> results = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                results.add("fizz buzz");
            } else if (i % 5 == 0) {
                results.add("buzz");
            } else if (i % 3 == 0) {
                results.add("fizz");
            } else {
                results.add(String.valueOf(i));
            }
        }
        return results;
    }

    public String[] fizzBuzz2(int n) {
        // write your code here
        String[] results = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                results[i-1] = "fizz buzz";
            } else if (i % 5 == 0) {
                results[i-1] = "buzz";
            } else if (i % 3 == 0) {
                results[i-1] = "fizz";
            } else {
                results[i-1] = String.valueOf(i);
            }
        }
        return results;
    }
}
