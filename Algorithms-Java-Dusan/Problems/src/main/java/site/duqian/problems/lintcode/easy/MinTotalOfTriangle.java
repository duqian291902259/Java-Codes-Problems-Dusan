package site.duqian.problems.lintcode.easy;

/**
 * Description:
 * 给定一个数字三角形，找到从顶部到底部的最小路径和。每一步可以移动到下面一行的相邻数字上。
 * <p>
 * <p>
 * 如果你只用额外空间复杂度O(n)的条件下完成可以获得加分，其中n是数字三角形的总行数。
 * <p>
 * 比如，给出下列数字三角形：
 * <p>
 * [
 * [2],
 * [3,4],
 * [6,5,7],
 * [4,1,8,3]
 * ]
 * 从顶到底部的最小路径和为11 ( 2 + 3 + 5 + 1 = 11)。
 *
 * @author 杜乾-Dusan,Created on 2018/1/31 - 18:29.
 *         E-mail:duqian2010@gmail.com
 */
public class MinTotalOfTriangle {
    /**
     * @param triangle: a list of lists of integers
     * @return: An integer, minimum path sum
     */
    public int minimumTotal(int[][] triangle) {
        // write your code here
        if (triangle == null || triangle.length == 0) {
            return 0;
        }
        int len = triangle.length;
        if (len == 1) {
            return triangle[0][0];
        }
        for (int i = len - 2; i >= 0; i--) {
            int length = triangle[i].length;
            for (int j = 0; j < length; j++) {
                triangle[i][j] = Math.min(triangle[i + 1][j], triangle[i + 1][j + 1]) + triangle[i][j];
            }
        }
        return triangle[0][0];
    }
}
