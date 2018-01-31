package site.duqian.problems.leetcode.easy;

import site.duqian.problems.ListNode;

/**
 * Description:Given a linked list, determine if it has a cycle in it.
 * Can you solve it without using extra space?
 *
 * 如果一个链表中没有环，那么我们在遍历的过程中最后一个元素会指向空地址。
 * 但是如果单纯的使用遍历法，当存在环的时候，会进入死循环，要避免就必须终止循坏。
 * so，我们可以在遍历过程中将每个元素都指向head，这样如果不存在环，就会有空指针，
 * 如果存在环，最终会指向head而结束。
 *
 * @author 杜乾-Dusan,Created on 2018/1/31 - 18:07.
 *         E-mail:duqian2010@gmail.com
 */
public class LinkedListCycle_141 {
    public boolean hasCycle(ListNode head) {
        ListNode p = head;
        while (p != null && p.next != null) {
            if (p.next == head) {
                return true;
            }
            //将p.next 指向head，防止有环时出现死循坏，如果有环会返回true
            ListNode temp = p.next;
            p.next = head;
            p = temp;
        }
        return false;
    }
}
