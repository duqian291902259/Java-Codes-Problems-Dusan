package site.duqian.problems.leetcode.easy;

import java.security.InvalidParameterException;

/**
 * Description:Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 * <p>
 * 1	5	10	50	100	500	1000
 * I	V	X	L	C	D	M
 * <p>
 * 49	XLIX	50-10-1+10
 * 50	L	    50
 * 51	LI	    50+1
 *
 * @author 杜乾-Dusan,Created on 2017/11/27 - 20:12.
 *         E-mail:duqian2010@gmail.com
 */
public class Roman2Integer {
    public int romanToInt(String s) {
        if (s == null || s == "") {
            throw new RuntimeException("not a vilid roman number");
        }
        int result = 0;
        char[] chars = s.toCharArray();
        int len = chars.length;
        int tempB = 0;
        for (int i = 0; i < len; i++) {
            int tempA = getNumber(chars[i]);
            if (i <= len - 2) {
                tempB = getNumber(chars[i + 1]);
            }
            if (tempA < tempB) {
                result += (-1 * tempA);
            } else {
                result += tempA;
            }
            tempB = 0;
        }
        return result;
    }

    private int getNumber(char aChar) {
        if ('I' == aChar) {
            return 1;
        } else if ('V' == aChar) {
            return 5;
        } else if ('X' == aChar) {
            return 10;
        } else if ('L' == aChar) {
            return 50;
        } else if ('C' == aChar) {
            return 100;
        } else if ('D' == aChar) {
            return 500;
        } else if ('M' == aChar) {
            return 1000;
        } else {
            return 0;
        }
    }
}
