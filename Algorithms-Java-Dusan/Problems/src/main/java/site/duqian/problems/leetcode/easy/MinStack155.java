package site.duqian.problems.leetcode.easy;

import java.util.Stack;

/**
 * Description:设计栈结构
 * Design a stack that supports push, pop, top, and
 * retrieving the minimum element in constant time.
 * <p>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * Example:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 * <p>
 * 入栈时：除了入普通栈之外，如果当前待入栈元素小于等于最小值栈顶元素，那么同时入最小值栈
 * 出栈时：除了出普通栈之外，如果当前待出栈元素小于等于最小值栈顶元素，那么同时出最小值栈
 * 查看栈顶元素：返回普通栈顶元素
 * 查看最小元素：返回最小值栈顶元素
 *
 * @author 杜乾-Dusan,Created on 2018/3/1 - 16:51.
 *         E-mail:duqian2010@gmail.com
 */
public class MinStack155 {

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(x);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */

    /**
     * initialize your data structure here.
     */
    public MinStack155() {
        stack = new Stack<>();
        stackMin = new Stack<>();
    }

    private int min = 0;
    private Stack<Integer> stackMin;
    private Stack<Integer> stack;

    public void push(int x) {
        stack.push(x);
        if (stackMin.isEmpty() || x <= stackMin.peek()) {
            min = x;
            stackMin.push(x);
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        if (!stackMin.isEmpty()) {
            int peek = stack.peek();
            int peek1 = stackMin.peek();
            if (peek == peek1) {
                stackMin.pop();
            }
        }
        stack.pop();
    }

    public int top() {
        if (stack.isEmpty()) {
            return -1;
        }
        int top = stack.peek();
        return top;
    }

    public int getMin() {
        if (stackMin.isEmpty()) {
            return -1;
        }
        return stackMin.peek();
    }

}
