//
// Created by DuQian on 5/29/21.
//

#ifndef CPP_ALGORITHM_H
#define CPP_ALGORITHM_H

//extern "C" {
#include <vector>
//};

using namespace std;

class easy {
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

protected:
    int num = 0;
};

#endif //CPP_ALGORITHM_H
