package site.duqian.problems.lintcode.easy;

/**
 * Description:
 * 给定一个字符串和一个偏移量，根据偏移量旋转字符串(从左向右旋转)
 * 对于字符串 "abcdefg".   len = 7;
 * <p>
 * offset=0 => "abcdefg"
 * offset=1 => "gabcdef"
 * offset=2 => "fgabcde"
 * offset=3 => "efgabcd"
 * 挑战
 * 在数组上原地旋转，使用O(1)的额外空间
 * <p>
 * ﻿这个题目以offset为基准，逐步交换char。也可以前部分逆序，后部分逆序，整体逆序，
 * 这里注意的是offeset会大于字符串长度的情况，所以要对offeset处理：offeset = offeset%len
 *
 * @author 杜乾-Dusan,Created on 2017/12/8 - 10:39.
 *         E-mail:duqian2010@gmail.com
 */
public class RotateString {
    /**
     * @param str:    An array of char
     * @param offset: An integer
     * @return: nothing
     */

    public void rotateString(char[] str, int offset) {
        // write your code here
        if (str != null && str.length != 0 && offset != 0) {
            int len = str.length;
            offset = offset % len;
            int index = len - offset;
            for (int i = 0; i < offset; i++) {
                for (int j = index + i; j > i; j--) {
                    char temp = str[j];
                    str[j] = str[j - 1];
                    str[j - 1] = temp;
                }
            }
        }
        System.out.println("after offset= " + offset + "=" + String.valueOf(str));
    }

    public void rotateString2(char[] str, int offset) {
        // write your code here
        if (str != null && str.length != 0 && offset != 0) {
            int len = str.length;
            int end = len - 1;
            offset = offset % len;
            reverseStr(str, 0, end - offset);
            reverseStr(str, end - offset + 1, end);
            reverseStr(str, 0, end);
        }
        System.out.println("after offset= " + offset + "=" + String.valueOf(str));
    }

    private void reverseStr(char[] str, int start, int end) {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }

}
