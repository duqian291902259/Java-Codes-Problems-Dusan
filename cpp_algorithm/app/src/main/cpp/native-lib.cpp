#include <jni.h>
#include <string>
#include "util/logger.h"
#include "Easy.h"
#include "Medium.h"

/**
 *
 */
extern "C" JNIEXPORT jstring JNICALL
Java_site_duqian_cpp_1algorithm_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    Easy easy_test;
    Medium medium_test;

    int result = easy_test.add(5, 6);
    std::string hello = "Hello from C++" + to_string(result);
    LOGI(TAG, "easy_test log %s,%d", hello.c_str(), result)

    //1，twoSum
    vector<int> vec = {2, 7, 11, 15};
    vector<int> find = easy_test.twoSum(vec, 9);
    vector<int> find2 = easy_test.twoSum2(vec, 9);
    LOGI(TAG, "find %d,%d", find[0], find[1])
    LOGI(TAG, "find2 %d,%d", find2[0], find2[1])


    //1，twoSum
    int reverseNum = easy_test.reverse(2147483646);
    LOGI(TAG, "reverseNum=%d", reverseNum)

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
    LOGI(TAG, "addNode %d,%d", l10->val, l10->next->val)
    /*while (addNode->next != nullptr) {
        LOGI(TAG, "addNode %d,%d", addNode->val, addNode->next->val)
    }*/

    return env->NewStringUTF(hello.c_str());
}