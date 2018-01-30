package site.duqian.problems.lintcode.easy;

/**
 * Description:64. 合并排序数组 II
 * 合并两个排序的整数数组A和B变成一个新的数组。
 * <p>
 * 给出A=[1,2,3,4]，B=[2,4,5,6]，返回 [1,2,2,3,4,4,5,6]
 * <p>
 * 你能否优化你的算法，如果其中一个数组很大而另一个数组很小？
 *
 * @author 杜乾-Dusan,Created on 2017/12/6 - 14:32.
 *         E-mail:duqian2010@gmail.com
 */
public class MergeSortedArray {
    /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        if (A == null && B == null) {
            return null;
        }
        if (A == null) {
            return B;
        }
        if (B == null) {
            return A;
        }
        //归并
        int lengthA = A.length;
        int lengthB = B.length;

        int i = lengthA - 1;
        int j = lengthB - 1;
        int index = lengthA + lengthB - 1;
        int[] arr = new int[index + 1];
        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                arr[index--] = A[i--];
            } else {
                arr[index--] = B[j--];
            }
        }
        while (i >= 0) {
            arr[index--] = A[i--];
        }
        while (j >= 0) {
            arr[index--] = B[j--];
        }
        return arr;
    }

    /**
     * 合并两个排序的整数数组A和B变成一个新的数组。
     * 你可以假设A具有足够的空间（A数组的大小大于或等于m+n）去添加B中的元素。
     *
     * @param A: sorted integer array A which has m elements, but size of A is m+n
     * @param m: An integer
     * @param B: sorted integer array B which has n elements
     * @param n: An integer
     * @return: nothing
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        int i = m - 1;
        int j = n - 1;
        int index = m + n - 1;
        while (i >= 0 && j >= 0) {
            int a = A[i];
            int b = B[j];
            if (a > b) {
                A[index--] = A[i--];
            } else {
                A[index--] = B[j--];
            }
        }
        while (i >= 0) {
            A[index--] = A[i--];
        }
        while (j >= 0) {
            A[index--] = B[j--];
        }
    }
}
