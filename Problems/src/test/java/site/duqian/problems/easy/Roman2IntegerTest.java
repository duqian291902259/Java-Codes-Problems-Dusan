package site.duqian.problems.easy;

import org.junit.Before;
import org.junit.Test;

import site.duqian.problems.leetcode.easy.Roman2Integer;

import static org.junit.Assert.assertEquals;

/**
 * Description:
 *
 * @author 杜乾-Dusan,Created on 2017/11/27 - 20:38.
 *         E-mail:duqian2010@gmail.com
 */
public class Roman2IntegerTest  {

    Roman2Integer instance = null;
    @Before
    public void setUp() throws Exception {
        instance = new Roman2Integer();
    }

    @Test(timeout = 1)
    public void romanToInt() throws Exception {
        assertEquals(800, instance.romanToInt("DCCC"));
        System.out.println("romanToInt="+instance.romanToInt("DCCC"));//800=500+100+100+100
        System.out.println("romanToInt="+instance.romanToInt("LXXXVII"));//50+10+10+10+5+1+1=87
        System.out.println("romanToInt="+instance.romanToInt("XCIX"));//99
        System.out.println("romanToInt="+instance.romanToInt("LXXXIV"));//50+10+10+10-1+5=84
    }

}