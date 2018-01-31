package site.duqian.problems.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角，下面的数是上面两个角的和，边都为1
 * Given an index k, return the kth row of the Pascal's triangle.
 * For example, given k = 3,
 * Return [1,3,3,1].
 * Note:
 * Could you optimize your algorithm to use only O(k) extra space?
 *
 * @author 杜乾-Dusan,Created on 2018/1/5 - 19:57.
 *         E-mail:duqian2010@gmail.com
 */
public class Pascal_Triangle_2_119 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> listAll = new ArrayList<>();
        List<Integer> lastList = new ArrayList<>();
        lastList.add(1);
        listAll.add(lastList);
        if (rowIndex == 0) {
            return lastList;
        }
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 1; j < i; j++) {//i行最多i个数
                temp.add(lastList.get(j) + lastList.get(j - 1));
            }
            temp.add(1);
            lastList = temp;
            listAll.add(temp);
        }
        return listAll.get(rowIndex);
    }
}
