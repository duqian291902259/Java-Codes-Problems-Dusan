package site.duqian.problems.easy;

import org.junit.Before;
import org.junit.Test;

import site.duqian.problems.leetcode.easy.IsPalindrome;

import static org.junit.Assert.assertEquals;


/**
 * Description:
 *
 * @author 杜乾-Dusan,Created on 2017/11/27 - 14:59.
 *         E-mail:duqian2010@gmail.com
 */
public class IsPalindromeTest{
    IsPalindrome isPalindrome;

    @Before
    public void setUp() throws Exception {
        isPalindrome = new IsPalindrome();
    }

    @Test
    public void isPalindrome() throws Exception {
        boolean palindrome = isPalindrome.isPalindrome(-2147447412);
        System.out.println("is palindrome ="+palindrome);
        assertEquals(false,palindrome);
    }

    @Test
    public void reverse() throws Exception {

    }

}