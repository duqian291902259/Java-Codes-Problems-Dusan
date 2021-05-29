#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_site_duqian_cpp_1algorithm_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}