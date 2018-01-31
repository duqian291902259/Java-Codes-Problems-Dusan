package site.duqian.problems.lintcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Description:给定一个列表，该列表中的每个要素要么是个列表，要么是整数。
 * 将其变成一个只包含整数的简单列表。
 * 注意事项:分别使用递归和非递归方式实现
 * 如果给定的列表中的要素本身也是一个列表，那么它也可以包含列表。
 *  [2，3，[5，6],[4，[6,7]],-->2,3,5,6,4,7
 * 极端情况：[[],[]],应该返回list，但length为0。返回null错误
 *
 * @author 杜乾-Dusan,Created on 2017/12/13 - 16:33.
 *         E-mail:duqian2010@gmail.com
 */
public class Flatten22 {
    /**
     * 获取所有int值的集合
     * Your code ran too much time than we expected. Check your time complexity.
     * Time limit exceeded usually caused by infinite loop
     * if your time complexity is the best.
     *
     * @return a list of integer
     */
    public List<Integer> flatten(List<NestedInteger> nestedList) {
        // Write your code here
        if (nestedList == null || nestedList.size() == 0) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        Stack<NestedInteger> stack = new Stack<>();
        pushToStack(stack, nestedList);
        while (!stack.isEmpty()) {
            NestedInteger pop = stack.pop();
            if (pop.isInteger()) {
                list.add(pop.getInteger());
            } else {
                pushToStack(stack, pop.getList());
            }
        }
        //一定要反转过来，因为栈是后进先出
        Collections.reverse(list);
        return list;
    }

    private void pushToStack(Stack<NestedInteger> stack, List<NestedInteger> nestedList) {
        if (nestedList == null || stack == null) {
            return;
        }
        for (NestedInteger integer : nestedList) {
            stack.push(integer);
        }
    }

    /**
     * 一定要在外面new list，全局保存所有int
     */
    private List<Integer> list = new ArrayList<>();

    /**
     * 递归实现
     *
     * @param nestedList
     * @return
     */
    public List<Integer> flatten2(List<NestedInteger> nestedList) {
        // Write your code here
        if (nestedList == null || nestedList.size() == 0) {
            return list;
        }
        for (NestedInteger nestedInteger : nestedList) {
            if (nestedInteger.isInteger()) {
                list.add(nestedInteger.getInteger());
            } else {
                list = flatten2(nestedInteger.getList());
            }
        }
        return list;
    }

    public interface NestedInteger {
        public boolean isInteger();

        public Integer getInteger();

        public List<NestedInteger> getList();
    }

    public static class NestedItem implements NestedInteger {
        private int value;
        private List<NestedInteger> list;

        public NestedItem(int value, List<NestedInteger> list) {
            this.value = value;
            this.list = list;
        }

        @Override
        public boolean isInteger() {
            return list == null;
        }

        @Override
        public Integer getInteger() {
            return value;
        }

        @Override
        public List<NestedInteger> getList() {
            return list;
        }
    }

}
