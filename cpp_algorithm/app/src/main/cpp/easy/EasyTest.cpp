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
    LOGI(TAG, "find %d,%d", find[0], find[1])
    LOGI(TAG, "find2 %d,%d", find2[0], find2[1])
}

int EasyTest::testReverseNum() {
    //int reverseNum = Easy::reverse(2147483646);
    int reverseNum = Easy::reverse(216986);
    LOGI(TAG, "reverseNum=%d", reverseNum)
    return reverseNum;
}

void EasyTest::testIsPalindrome() {
    bool isPalindrome = Easy::isPalindrome(121);
    string s = "false";
    if (isPalindrome) {
        s = "true";
    }
    LOGI(TAG, "isPalindrome=%s", s.c_str())
}

void EasyTest::testRomanToInt() {
    int romanToInt = Easy::romanToInt("LVIII");
    LOGI(TAG, "romanToInt=%d", romanToInt)

    int romanToInt2 = Easy::romanToInt("MCMXCIV");
    LOGI(TAG, "romanToInt2=%d", romanToInt2)
}

void EasyTest::longestCommonPrefix() {
    vector<string> vec = {"flower", "flow", "flight"};
    string prefix = Easy::longestCommonPrefix(vec);
    LOGI(TAG, "longestCommonPrefix=%s", prefix.c_str())
}


