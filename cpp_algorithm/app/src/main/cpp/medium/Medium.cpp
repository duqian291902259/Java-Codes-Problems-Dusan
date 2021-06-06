//
// Created by DuQian on 5/29/21.
//
#include "Medium.h"

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */

ListNode *Medium::addTwoNumbers(ListNode *l1, ListNode *l2) {

    ListNode *head = nullptr;//结果
    ListNode *pNew = head;

    ListNode *p = l1;
    ListNode *q = l2;
    int cnt = 0;

    while ((p != nullptr) && (q != nullptr))//依次取出l1,l2中元素直至其中一个链表结束
    {
        int sum = cnt + p->val + q->val;//计算两个元素和进位相加的结果
        if (sum >= 10)//结果大于10
        {
            int tmp = sum;
            sum = sum % 10;//余数
            cnt = tmp / 10;//进位

        } else//如果没有产生进位，及时将以前产生进位清零
        {
            cnt = 0;
        }

        ListNode *tmp = new ListNode(sum);//创建新结点存放
        if (pNew == nullptr)//如果是结果的首元素
        {
            head = pNew = tmp;
        } else//否则插入到结果的最后位置
        {
            pNew->next = tmp;
            pNew = pNew->next;
        }

        p = p->next;//迭代到下一个位置
        q = q->next;


    }

    if (nullptr == p)//如果l1 结束了
    {
        while (q != nullptr)//判断l2是否遍历结束
        {
            int sum = cnt + q->val;
            if (sum >= 10) {
                int tmp = sum;
                sum = sum % 10;
                cnt = tmp / 10;
            } else {
                cnt = 0;
            }

            ListNode *tmp = new ListNode(sum);
            if (pNew == nullptr) {
                head = pNew = tmp;
            } else {
                pNew->next = tmp;
                pNew = pNew->next;
            }

            q = q->next;
        }
    } else if (nullptr == q)//
    {
        while (p != nullptr) {
            int sum = cnt + p->val;
            if (sum >= 10) {
                int tmp = sum;
                sum = sum % 10;
                cnt = tmp / 10;
            } else {
                cnt = 0;
            }

            ListNode *tmp = new ListNode(sum);
            if (pNew == nullptr) {
                head = pNew = tmp;
            } else {
                pNew->next = tmp;
                pNew = pNew->next;
            }

            p = p->next;
        }
    }

    if (cnt != 0)//如果最高位相加产生进位
    {
        ListNode *tmp = new ListNode(cnt);
        if (pNew == nullptr) {
            head = pNew = tmp;
        } else {
            pNew->next = tmp;
            pNew = pNew->next;
        }
    }
    return head;

}