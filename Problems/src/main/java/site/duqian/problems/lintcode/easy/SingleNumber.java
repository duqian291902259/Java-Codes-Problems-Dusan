package site.duqian.problems.lintcode.easy;

/**
 * Description:给出2*n + 1 个的数字，除其中一个数字之外其他每个数字均出现两次，找到这个数字。
 * <p>
 * 给出 [1,2,2,1,3,4,3]，返回 4
 * <p>
 * 一次遍历，常数级的额外空间复杂度
 *
 * @author 杜乾-Dusan,Created on 2018/1/5 - 16:52.
 *         E-mail:duqian2010@gmail.com
 */
public class SingleNumber {
    /**
     * @param A: An integer array
     * @return: An integer
     */
    public int singleNumber(int[] A) {
        // write your code here
        if (A == null || A.length == 0) {
            return -1;
        }
        int len = A.length;
        int num = 0;
        for (int i = 0; i < len; i++) {
            num ^= A[i];//相同的数抑或运算，^相同为0，不同为1
        }
        return num;
    }
}
