package site.duqian.problems.leetcode.easy;

import site.duqian.problems.ListNode;

/**
 * Description:删除链表中的重复元素
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * For example：
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 *
 * @author 杜乾-Dusan,Created on 2017/12/20 - 11:11.
 *         E-mail:duqian2010@gmail.com
 */
public class NodeListDeleteDuplicates {

    /**
     * Definition for singly-linked list.
     **/
    /*public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }*/
    /**
     * 元素去重
     *
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode p = head;
        while (p.next != null) {
            ListNode next = p.next;
            if (p.val == next.val) {
                //指向下下个节点就可以了
                p.next = next.next;
            } else {
                p = next;
            }
        }
        //切记，这里返回的还是head节点，不是p节点，p是方便操作各个元素的变量
        return head;
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
