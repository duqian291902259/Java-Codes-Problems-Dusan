#include <jni.h>
#include <string>
#include "util/logger.h"
#include "easy.h"

/**
 *
 */
extern "C" JNIEXPORT jstring JNICALL
Java_site_duqian_cpp_1algorithm_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {

    easy test;
    int result = test.add(5, 6);

    std::string hello = "Hello from C++" + to_string(result);
    LOGI(TAG, "test log %s,%d", hello.c_str(), result)

    //twoSum
    vector<int> vec = {2, 7, 11, 15};
    vector<int> find = test.twoSum(vec, 9);
    vector<int> find2 = test.twoSum2(vec, 9);
    LOGI(TAG, "find %d,%d", find[0], find[1])
    LOGI(TAG, "find2 %d,%d", find2[0], find2[1])

    return env->NewStringUTF(hello.c_str());
}