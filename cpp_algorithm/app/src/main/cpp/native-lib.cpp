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

    std::string hello = "Hello from C++"+to_string(result);

    LOGI(TAG, "test log %s,%d", hello.c_str(), result)

    return env->NewStringUTF(hello.c_str());
}