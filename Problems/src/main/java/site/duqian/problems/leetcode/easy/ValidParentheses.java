package site.duqian.problems.leetcode.easy;

import java.util.Stack;

/**
 * Description:Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * 用一个栈，开始遍历输入字符串，如果当前字符为左半边括号时，则将其压入栈中，
 * 如果遇到右半边括号时，若此时栈为空，则直接返回false，
 * 如不为空，则取出栈顶元素，若为对应的左半边括号，则继续循环，反之返回false
 * 最后需要判断栈是否为空。不为空说明没有找到结尾。
 * @author 杜乾-Dusan,Created on 2017/12/1 - 11:31.
 *         E-mail:duqian2010@gmail.com
 */
public class ValidParentheses {
    public boolean isValidParentheses(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            String s = String.valueOf(c);
            if ("({[".contains(s)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (c == ')' && stack.pop() != '(') {
                    return false;
                }
                if (c == '}' && stack.pop() != '{') {
                    return false;
                }
                if (c == ']' && stack.pop() != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
