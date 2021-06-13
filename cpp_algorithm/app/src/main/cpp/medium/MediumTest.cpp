//
// Created by DuQian on 5/29/21.
//
#include "MediumTest.h"
#include "../util/logger.h"

using namespace std;

void testAddTwoNum() {
    //2，想数相加
    ListNode *l10 = new ListNode(2);
    ListNode *l11 = new ListNode(4);
    ListNode *l12 = new ListNode(3);
    l10->next = l11;
    l11->next = l12;

    ListNode *l20 = new ListNode(5);
    ListNode *l21 = new ListNode(6);
    ListNode *l22 = new ListNode(4);
    l20->next = l21;
    l21->next = l22;

    //ListNode *addNode = medium_test.addTwoNumbers(l10, l20);
    LOGI(TAG, "addNode %d,%d", l10->val, l10->next->val);
    /*while (addNode->next != nullptr) {
        LOGI(TAG, "addNode %d,%d", addNode->val, addNode->next->val)
    }*/
}

