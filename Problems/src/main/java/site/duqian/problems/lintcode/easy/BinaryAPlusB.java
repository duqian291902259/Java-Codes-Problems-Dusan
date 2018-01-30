package site.duqian.problems.lintcode.easy;

/**
 * Description:给出两个整数a和b, 求他们的和, 但不能使用 + 等数学运算符。
 * a和b都是32位整数,可以使用位运算符
 * eg:如果 a=1 并且 b=2，返回3
 *
 * @author 杜乾-Dusan,Created on 2017/12/4 - 16:48.
 *         E-mail:duqian2010@gmail.com
 */
public class BinaryAPlusB {
    /**
     * @param : An integer
     * @param : An integer
     * @return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        // write your code here
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        int sum, temp;
        temp = a ^ b;//各位相加，忽略进位
        sum = (a & b) << 1;//&，只有1&1需要进位
        System.out.println("sum2=" + Integer.toBinaryString(sum) + ",temp2 =" + Integer.toBinaryString(temp));
        return aplusb(sum, temp);
    }
}

/*
* 考虑一个普通的加法计算：5＋17＝22
*  00101   = 5
*  10001   = 17
*
*  10100
*

在十进制加法中可以分为如下3步进行：
    1. 忽略进位，只做对应各位数字相加，得到12（个位上5＋7＝12，忽略进位，结果2）；
    2. 记录进位，上一步计算中只有个位数字相加有进位1，进位值为10；
    3. 按照第1步中的方法将进位值与第1步结果相加，得到最终结果22。

下面考虑二进制数的情况（5＝101，17＝10001）：
仍然分3步：
    1. 忽略进位，对应各位数字相加，得到10100；
    2. 记录进位，本例中只有最后一位相加时产生进位1，进位值为10（二进制）；
    3. 按照第1步中的方法将进位值与第1步结果相加，得到最终结果10110，正好是十进制数22的二进制表示。

接下来把上述二进制加法3步计算法用位运算替换：
    第1步（忽略进位）：0＋0＝0，0＋1＝1，1＋0＝0，1＋1＝0，典型的异或运算。
    第2步：很明显，只有1＋1会向前产生进位1，相对于这一数位的进位值为10，而10＝(1&1)<<1。
    第3步：将第1步和第2步得到的结果相加，其实又是在重复上述2步，直到不再产生进位为止。
    */
