package site.duqian.problems.lintcode.easy;

import site.duqian.problems.ListNode;

/**
 * Description:96
 * 给定一个单链表和数值x，划分链表使得所有小于x的节点排在大于等于x的节点之前。
 * 你应该保留两部分内链表节点原有的相对顺序。
 * 给定链表 1->4->3->2->5->2->null，并且 x=3
 * 返回 1->2->2->4->3->5->null
 * <p>
 * 思路：将所有小于等于给定值的节点取出组成一个新的链表a，
 * 将所有大于给定值的节点取出组成另一个新的链表b，只要将b链表直接接在a链表后即可
 *
 * @author 杜乾-Dusan,Created on 2018/1/25 - 15:09.
 *         E-mail:duqian2010@gmail.com
 */
public class PartitionOfNodeList96 {
    /**
     * @param head: The first node of linked list
     * @param x:    An integer
     * @return: A ListNode
     */
    public ListNode partition(ListNode head, int x) {
        // write your code here
        if (head == null) {
            return null;
        }
        ListNode current = head;
        ListNode minList = new ListNode(0);
        ListNode maxList = new ListNode(0);
        ListNode min = minList;
        ListNode max = maxList;
        while (current != null) {
            if (current.val < x) {
                min.next = current;
                min = min.next;
            } else {
                max.next = current;
                max = max.next;
            }
            current = current.next;
        }
        min.next = maxList.next;
        max.next = null;
        return minList.next;
    }
}
