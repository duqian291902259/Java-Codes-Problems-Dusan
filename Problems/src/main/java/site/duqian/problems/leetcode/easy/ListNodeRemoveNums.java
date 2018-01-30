package site.duqian.problems.leetcode.easy;

import site.duqian.problems.ListNode;

/**
 * Description:删除链表中等于给定值val的所有节点。
 * 样例:给出链表 1->2->3->3->4->5->3, 和 val = 3,
 * 你需要返回删除3之后的链表：1->2->4->5。
 *
 * @author 杜乾-Dusan,Created on 2017/11/27 - 10:48.
 *         E-mail:duqian2010@gmail.com
 */
public class ListNodeRemoveNums {
    /*public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) {
            val = x;
        }
    }*/

    /**
     * //1->2->3->3->4->5->3
     *
     * @param head: a ListNode
     * @param val:  An integer
     * @return ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // write your code here
        if (head == null) {
            return null;
        }
        ListNode p = head, q = head.next;
        while(q != null) {
            if(q.val == val) {
                p.next = q.next;
            }else{
                p = p.next;
            }
            q = q.next;
        }
        if (head.val == val) {
            head = head.next;
        }
        return head;
    }
}
