package site.duqian.problems.lintcode.easy;

import java.util.Stack;

import site.duqian.problems.ListNode;

/**
 * Description:翻转一个链表
 * 给出一个链表1->2->3->null，这个翻转后的链表为3->2->1->null
 * 在原地一次翻转完成?
 *
 * @author 杜乾-Dusan,Created on 2017/12/18 - 23:06.
 *         E-mail:duqian2010@gmail.com
 */
public class NodeListReverse {
    //Definition for ListNode.
    /*public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }*/

    /**
     * 在原地一次翻转完成，把next节点换成它前面的节点，循坏转换
     * @param head: n
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        //定义三个节点变量：p,next,prev
        ListNode p = head;
        ListNode prev = null;
        ListNode reverseHead = null;
        while (p != null) {
            ListNode pNext = p.next;
            if (pNext == null) {
                reverseHead = p;
            }
            p.next = prev;
            prev = p;
            p = pNext;
        }
        return reverseHead;
    }

    /**
     * @param head: n
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse2(ListNode head) {
        // write your code here
        if (head == null) {
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        ListNode reverse = stack.pop();
        ListNode reverseTemp = reverse;

        while (!stack.isEmpty()) {
            ListNode pop = stack.pop();
            reverseTemp.next = pop;
            reverseTemp = reverseTemp.next;
        }
        reverseTemp.next = null;
        return reverse;
    }

    public static void printListNode(ListNode listNode) {
        //第一个要输出
        ListNode p = listNode;
        while (p != null) {
            System.out.println("node = " + p.val);
            p = p.next;
        }
    }
}
