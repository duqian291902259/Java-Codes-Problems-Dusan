package site.duqian.problems.easy;

import org.junit.Before;
import org.junit.Test;

import site.duqian.problems.ListNode;
import site.duqian.problems.leetcode.easy.ListNodeRemoveNums;

/**
 * Description:
 *
 * @author 杜乾-Dusan,Created on 2017/11/28 - 10:25.
 *         E-mail:duqian2010@gmail.com
 */
public class ListNodeRemoveNumsTest {
    ListNodeRemoveNums instance = null;

    @Before
    public void setUp() throws Exception {
        instance = new ListNodeRemoveNums();
    }

    @Test
    public void testRemoveNode() throws Exception {
        //1->2->3->3->4->5->3
        ListNode nodeA = new ListNode(3);
        ListNode nodeB = new ListNode(2);
        ListNode nodeC = new ListNode(3);
        ListNode nodeD = new ListNode(3);
        ListNode nodeE = new ListNode(4);
        ListNode nodeF = new ListNode(5);
        ListNode nodeG = new ListNode(3);
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        nodeE.next = nodeF;
        nodeF.next = nodeG;
        //printListNode(nodeA);

        ListNode listNode = instance.removeElements(nodeA, 3);
        if (listNode == null){
            System.out.println("node = null");
            return;
        }
        printListNode(listNode);
    }

    private void printListNode(ListNode listNode) {
        System.out.println("node = "+listNode.val);
        ListNode p = listNode.next;
        while (p != null) {
            System.out.println("node = "+p.val);
            p = p.next;
        }
    }
}