//
// Created by DuQian on 5/29/21.
//

#ifndef CPP_ALGORITHM_H
#define CPP_ALGORITHM_H
#define INT_MAX 2147483647
#define INT_MIN (-INT_MAX-1)
//extern "C" {
#include <vector>
//};
#include "../util/logger.h"

using namespace std;

class Easy {
private:
    const char TAG_NAME = 'A';
public:

    /**
     * 1，两数之和
     * 输入：nums = [2,7,11,15], target = 9,输出：[0,1]
     * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1]
     */
    std::vector<int> twoSum(std::vector<int> &nums, int target);

    std::vector<int> twoSum2(std::vector<int> &nums, int target);

    int add(int a, int b);


    /**
     * 给定一个 32 位有符号整数，将整数中的数字进行反转。
     * 输入: -123 输出: -321  输入: 120  输出: 21
     */
    int reverse(int32_t x);

protected:
    int num = 0;
};

#endif //CPP_ALGORITHM_H
