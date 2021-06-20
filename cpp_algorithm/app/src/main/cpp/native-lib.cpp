#include <jni.h>
#include <string>
#include "util/logger.h"
#include "Easy.h"
#include "EasyTest.h"
#include "Medium.h"

/**
 * jni接口
 */
extern "C" JNIEXPORT jstring JNICALL
Java_site_duqian_cpp_1algorithm_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {

    std::string hello = "Hello from C++" + to_string(345);
    LOGI(TAG, "easy_test log %s", hello.c_str())
    //1，twoSum
    EasyTest::testTwoSum();

    //2，twoSum
    EasyTest::testReverseNum();

    //3，回文数
    EasyTest::testIsPalindrome();

    //11，罗马数字转整数
    EasyTest::testRomanToInt();

    return env->NewStringUTF(hello.c_str());
}