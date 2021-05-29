package site.duqian.problems.lintcode.easy;


/**
 * Description:给定一个只含非负整数的m*n网格，找到一条从左上角到右下角的可以使数字和最小的路径。
 * <p>
 * 你在同一时间只能向下或者向右移动一步
 * 分析：
 * <p>
 * dp[ i+1 ][ j+1 ] = min( dp [ i+1 ][ j ] , dp[ i ][ j+1 ] ) + grid[ i ][ j ]
 * <p>
 * ***   时间复杂度 O（n*m）， 空间复杂度 O（n*m） ****
 *
 * @author 杜乾-Dusan,Created on 2018/3/1 - 18:40.
 *         E-mail:duqian2010@gmail.com
 */
public class MinPathSum {

    public int minPathSum(int[][] grid) {
        // write your code here
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[m - 1][n - 1];
    }


}
