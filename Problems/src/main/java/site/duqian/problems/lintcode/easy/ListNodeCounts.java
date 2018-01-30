package site.duqian.problems.lintcode.easy;

import site.duqian.problems.ListNode;

/**
 * Description:计算链表中有多少个节点.
 *
 * @author 杜乾-Dusan,Created on 2017/11/28 - 17:53.
 *         E-mail:duqian2010@gmail.com
 */
public class ListNodeCounts {
   /* public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }*/

    /**
     * @param head: the first node of linked list.
     * @return: An integer
     */
    public int countNodes(ListNode head) {
        // write your code here
        int count = 0;
        if (head == null) {
            return 0;
        }
        ListNode q = head.next;
        count = +1;
        while (q != null) {
            q = q.next;
            count++;
        }
        return count;
    }

    public static void printListNode(ListNode listNode) {
        //第一个要输出
        System.out.println("node = " + listNode.val);
        ListNode p = listNode.next;
        while (p != null) {
            System.out.println("node = " + p.val);
            p = p.next;
        }
    }
}
