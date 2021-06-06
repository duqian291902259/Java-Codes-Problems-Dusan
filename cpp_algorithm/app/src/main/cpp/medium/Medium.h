//
// Created by DuQian on 6/5/21.
//

#ifndef CPP_ALGORITHM_H
#define CPP_ALGORITHM_H



#endif //CPP_ALGORITHM_H

struct ListNode {
    int val;
    ListNode *next;

    ListNode() : val(0), next(nullptr) {}

    ListNode(int x) : val(x), next(nullptr) {}

    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Medium {
private:
public:
    /**
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，
     * 并且它们的每个节点只能存储 一位 数字。
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     */

    ListNode *addTwoNumbers(ListNode *l1, ListNode *l2);

protected:
    int num = 0;
};


