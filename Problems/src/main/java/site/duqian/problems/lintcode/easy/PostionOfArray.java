package site.duqian.problems.lintcode.easy;

/**
 * Description:60. 搜索插入位置
 * 给定一个排序数组和一个目标值，如果在数组中找到目标值则返回索引。
 * 如果没有，返回到它将会被按顺序插入的位置。你可以假设在数组中无重复元素。
 *
 * @author 杜乾-Dusan,Created on 2017/12/31 - 09:43.
 *         E-mail:duqian2010@gmail.com
 */
public class PostionOfArray {
    /**
     * @param A:      an integer sorted array
     * @param target: an integer to be inserted
     * @return: An integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
        if (A == null || A.length == 0) {
            return 0;
        }
        int len = A.length;
        int start = 0;
        int end = len - 1;
        while (start <= end) {
            int mid = (end - start) / 2 + start;
            int midValue = A[mid];
            if (midValue == target) {
                return mid;
            } else if (target > midValue) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
