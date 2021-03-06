#include <jni.h>
#include <string>
#include "util/logger.h"
#include "Easy.h"
#include "EasyTest.h"

/**
 * jni接口
 */
extern "C" JNIEXPORT jstring JNICALL
Java_site_duqian_cpp_1algorithm_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {

    std::string hello = "Hello from C++" + to_string(345);
    LOGI(TAG, "easy_test log %s", hello.c_str())
    //1，1. 两数之和
    EasyTest::testTwoSum();

    //2，7. 整数反转
    EasyTest::testReverseNum();

    //3，9. 回文数
    EasyTest::testIsPalindrome();

    //4，13. 罗马数字转整数
    EasyTest::testRomanToInt();

    //5,14. 最长公共前缀
    EasyTest::longestCommonPrefix();

    //6,20. 有效的括号
    EasyTest::isValidPunctuation();

    //7,26. 删除有序数组中的重复项
    EasyTest::testRemoveDuplicates();

    //8,27. 移除元素
    EasyTest::testRemoveElement();

    //9,1. 合并两个有序链表
    EasyTest::testMergeTwoLists();

    return env->NewStringUTF(hello.c_str());
}