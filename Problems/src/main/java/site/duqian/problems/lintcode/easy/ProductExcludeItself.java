package site.duqian.problems.lintcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:?没整明白什么情况
 * 给定一个整数数组A。
 * 定义B[i] = A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]， 计算B的时候请不要使用除法。
 * 样例
 * 给出A=[1, 2, 3]，返回 B为[6, 3, 2]
 *
 * @author 杜乾-Dusan,Created on 2017/12/26 - 17:34.
 *         E-mail:duqian2010@gmail.com
 */
public class ProductExcludeItself {
    /**
     * @param nums: Given an integers array A
     * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here
        ArrayList<Long> res = new ArrayList<Long>();
        if (nums == null || nums.size() == 0) {
            return res;
        }
        int size = nums.size();
        long[] lProduct = new long[size];
        long[] rProduct = new long[size];
        lProduct[0] = 1;
        for (int i = 1; i < size; i++) {
            lProduct[i] = lProduct[i - 1] * nums.get(i - 1);
        }
        rProduct[size - 1] = 1;
        for (int j = size - 2; j >= 0; j--) {
            rProduct[j] = rProduct[j + 1] * nums.get(j + 1);
        }
        for (int k = 0; k < size; k++) {
            res.add(lProduct[k] * rProduct[k]);
        }
        return res;
    }

}
