//
// Created by DuQian on 5/29/21.
//

#ifndef CPP_ALGORITHM_H
#define CPP_ALGORITHM_H
#define INT_MAX 2147483647
#define INT_MIN (-INT_MAX-1)
//extern "C" {
#include <vector>
#include <string>
//};
#include "../util/logger.h"

using namespace std;

class Easy {
private:
    const string a = "DQ";
public:

    /**
     * 1，两数之和
     * 输入：nums = [2,7,11,15], target = 9,输出：[0,1]
     * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1]
     */
    static std::vector<int> twoSum(std::vector<int> &nums, int target);

    static std::vector<int> twoSum2(std::vector<int> &nums, int target);

    /**
     * 给定一个 32 位有符号整数，将整数中的数字进行反转。
     * 输入: -123 输出: -321  输入: 120  输出: 21
     */
    static int reverse(int32_t x);

    /**
    * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
    */
    static bool isPalindrome(int x);

protected:
    int num = 0;
};

#endif //CPP_ALGORITHM_H
