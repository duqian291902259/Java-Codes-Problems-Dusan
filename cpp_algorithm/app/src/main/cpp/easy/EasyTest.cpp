//
// Created by DuQian on 5/29/21.
//
#include "EasyTest.h"
#include "../util/logger.h"
#include "Easy.h"

using namespace std;

class EasyTest2 {
public:
    static void longestCommonPrefix() {
        vector<string> vec = {"flower", "flow", "flight"};
        string prefix = Easy::longestCommonPrefix(vec);
        LOGI(TAG, "longestCommonPrefix=%s", prefix.c_str())
    }
};

/**
 * 测试简单算法题
 */
void EasyTest::testTwoSum() {
    vector<int> vec = {2, 7, 11, 15};
    vector<int> find = Easy::twoSum(vec, 9);
    vector<int> find2 = Easy::twoSum2(vec, 9);
    LOGI(TAG, "find %d,%d", find[0], find[1]);
    LOGI(TAG, "find2 %d,%d", find2[0], find2[1]);
}

int EasyTest::testReverseNum() {
    //int reverseNum = Easy::reverse(2147483646);
    int reverseNum = Easy::reverse(216986);
    LOGI(TAG, "reverseNum=%d", reverseNum);
    return reverseNum;
}

void EasyTest::testIsPalindrome() {
    bool isPalindrome = Easy::isPalindrome(121);
    string s = "false";
    if (isPalindrome) {
        s = "true";
    }
    LOGI(TAG, "isPalindrome=%s", s.c_str());
}

void EasyTest::testRomanToInt() {
    int romanToInt = Easy::romanToInt("LVIII");
    LOGI(TAG, "romanToInt=%d", romanToInt)

    int romanToInt2 = Easy::romanToInt("MCMXCIV");
    LOGI(TAG, "romanToInt2=%d", romanToInt2);
}

void EasyTest::longestCommonPrefix() {
    vector<string> vec = {"flower", "flow", "flight"};
    string prefix = Easy::longestCommonPrefix(vec);
    LOGI(TAG, "longestCommonPrefix=%s", prefix.c_str());
}

void EasyTest::isValidPunctuation() {
    bool isValidPunctuation = Easy::isValidPunctuation("([])");
    string s = "false";
    if (isValidPunctuation) {
        s = "true";
    }
    LOGI(TAG, "isValidPunctuation=%s", s.c_str());
}

void EasyTest::testRemoveDuplicates() {
    vector<int32_t> vec = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int size = Easy::removeDuplicates(vec);
    for (int i = 0; i < size; i++) {
        LOGI(TAG, "testRemoveDuplicates=%d", vec[i]);
    }
    LOGI(TAG, "testRemoveDuplicates size =%d", size);
}

void EasyTest::testRemoveElement() {
    vector<int32_t> vec = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int size = Easy::removeElement(vec, 1);
    //++i与i++是有不同结果的
    for (int i = 0; i < size; i++) {
        LOGI(TAG, "testRemoveElement=%d", vec[i]);
    }
    LOGI(TAG, "testRemoveElement size =%d", size);
}

void EasyTest::testMergeTwoLists() {
    ListNode *node0 = new ListNode(0);
    ListNode *node1 = new ListNode(1);
    ListNode *node2 = new ListNode(2);
    ListNode *node3 = new ListNode(3);
    ListNode *node4 = new ListNode(4);
    ListNode *node5 = new ListNode(5);
    ListNode *node6 = new ListNode(6);
    ListNode *node7 = new ListNode(7);
    ListNode *node8 = new ListNode(8);

    node0->next = node1;
    node1->next = node2;
    node2->next = node8;

    node3->next = node4;
    node4->next = node5;
    node5->next = node6;
    node6->next = node7;

    ListNode *l1 = node0;

    ListNode *l2 = node3;

    ListNode *result = Easy::mergeTwoLists(l1, l2);
    LOGI(TAG, "testMergeTwoLists=%d", result->val)
    int size = 0;
    while (result->next) {
        size++;
        LOGI(TAG, "testMergeTwoLists=%d", result->next->val)
        result->next = result->next->next;
    }
    LOGI(TAG, "testMergeTwoLists size =%d", size)
}


