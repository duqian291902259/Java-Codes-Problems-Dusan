package site.duqian.problems.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角，下面的数是上面两个角的和，边都为1
 * Description:Given numRows, generate the first numRows of Pascal's triangle.
 * For example, given numRows = 5,
 * Return
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 *
 * @author 杜乾-Dusan,Created on 2018/1/5 - 19:57.
 *         E-mail:duqian2010@gmail.com
 */
public class Pascal_Triangle_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listAll = new ArrayList<>();
        if (numRows == 0) {
            return listAll;
        }
        List<Integer> lastList = new ArrayList<>();
        lastList.add(1);
        listAll.add(lastList);
        if (numRows == 1) {
            return listAll;
        }
        for (int i = 1; i < numRows; i++) {List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 1; j < i; j++) {//i行最多i个数
                temp.add(lastList.get(j) + lastList.get(j - 1));
            }
            temp.add(1);
            lastList = temp;
            listAll.add(temp);
        }
        return listAll;
    }
}
