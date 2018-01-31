package site.duqian.problems.lintcode.easy;

/**
 * Description:
 * 写出一个高效的算法来搜索 m × n矩阵中的值。
 * 这个矩阵具有以下特性：
 * 每行中的整数从左到右是排序的。
 * 每行的第一个数大于上一行的最后一个整数。
 * 考虑下列矩阵：
 * [[1, 3, 5, 7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]]
 * 给出 target = 3，返回 true
 * 挑战 O(log(n) + log(m)) 时间复杂度
 *
 * @author 杜乾-Dusan,Created on 2017/12/13 - 20:52.
 *         E-mail:duqian2010@gmail.com
 */
public class SearchNumFromMatrix {
    /**
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int len = matrix.length;//多少行
        for (int i = 0; i < len; i++) {
            int[] nums = matrix[i];
            int length = nums.length;
            int iLastNum = nums[length - 1];//i行最后一个数
            if (iLastNum < target) {
                continue;
            } else {
                //循坏遍历该行数组
                for (int j = 0; j < length; j++) {
                    if (nums[j] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
