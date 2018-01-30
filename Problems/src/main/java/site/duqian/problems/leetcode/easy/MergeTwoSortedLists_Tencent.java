package site.duqian.problems.leetcode.easy;

import site.duqian.problems.ListNode;

/**
 * Description:Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 * <p>
 * su a
 *
 * @author 杜乾-Dusan,Created on 2017/12/2 - 17:06.
 *         E-mail:duqian2010@gmail.com
 */
public class MergeTwoSortedLists_Tencent {
    /*public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }*/


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode newList = null;
        if (l1.val < l2.val) {
            newList = l1;
            newList.next = mergeTwoLists(l1.next, l2);
        } else {
            newList = l2;
            newList.next = mergeTwoLists(l1, l2.next);
        }
        return newList;

    }
}
