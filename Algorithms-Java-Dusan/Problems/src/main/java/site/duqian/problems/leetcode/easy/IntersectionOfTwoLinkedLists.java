package site.duqian.problems.leetcode.easy;

import site.duqian.problems.ListNode;

/**
 * Description:写一个函数来寻找两个单链表开始交汇的节点。
 * 比如，下面这两个链表：
 * <p>
 * 从节点 c1 开始交汇
 * 注意：
 * 如果两个链表完全不交汇，返回 null。
 * 函数返回后原链表必须保持初始结构。
 * 你可以假设整个链表结构都没有任何循环。
 * 你的代码应该在O(n)的时间和O(1)的内存中完成。
 *
 * @author 杜乾-Dusan,Created on 2018/3/7 - 09:55.
 *         E-mail:duqian2010@gmail.com
 */
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //boundary check
        if (headA == null || headB == null) {
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        //if a & b have different len, then we will stop the loop after second iteration
        while (a != b) {
            //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }

        return a;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode listA = headA, listB = headB;
        while (listA != listB) {
            if (listA == null) listA = headB;
            if (listB == null) listB = headA;
            listA = listA.next;
            listB = listB.next;
        }
        return listA;

    }
}
/*这个做法很巧妙的地方在于其循环体的内容，每轮循环都将两个链表的标记往后移动一个，
当移动到末尾后就跳到另一个链表头再移动，循环的结束条件是两个标记相同。
什么情况下会相同呢？两种情况，一是遇到了相同节点，另一个是完全没有相同节点，
由于都会遍历一次两个链表，所以会在同时到达null，如果两个链表长度一直，
那么不用跳，直接遍历一次没有交汇就都同时到null了。如果有交汇的，那一定是第一个交汇点。*/
