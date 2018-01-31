package site.duqian.problems.lintcode.easy;

/**
 * Description:
 * 给一组整数，按照升序排序，使用选择排序，冒泡排序，插入排序或者任何 O(n2) 的排序算法。
 *
 * @author 杜乾-Dusan,Created on 2017/11/27 - 15:14.
 *         E-mail:duqian2010@gmail.com
 */
public class SortInteger {
    /**
     * @param A: an integer array
     * @return:
     */
    public void sortIntegers(int[] A) {
        // write your code here
        if (A == null || A.length <= 0) {
            return;
        }
        int len = A.length;
        int temp = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (A[i] > A[j]) {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
    }
    // TODO: 2017/11/27 其他的排序算法
}
