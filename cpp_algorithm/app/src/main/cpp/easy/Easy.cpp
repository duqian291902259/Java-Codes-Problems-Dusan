//
// Created by DuQian on 5/29/21.
//
#include "Easy.h"
#include <unordered_map>

using namespace std;

vector<int> Easy::twoSum(vector<int> &nums, int target) {
    for (int i = 0; i < nums.size(); ++i) {
        for (int j = i + 1; j < nums.size(); ++j) {
            if (nums[i] + nums[j] == target) {
                return {i, j};
            }
        }
    }
    return {};
}

vector<int> Easy::twoSum2(vector<int> &nums, int target) {
    unordered_map<int, int> map;
    for (int i = 0; i < nums.size(); ++i) {
        auto find = map.find(target - nums[i]);
        if (find != map.end()) {
            return {find->second, i};
        }
        map[nums[i]] = i;
    }
    return {};
}

int Easy::reverse(int32_t x) {
    //int flag = x < 0 ? -1 : 1;
    long sum = 0;
    LOGI(TAG, "sum=%d", sum)
    while (x) {
        //if ((flag == -1 && (INT_MIN / 10 > sum)) || (flag == 1 && INT_MAX / 10 < sum))return 0;
        /*if ((flag == -1 && (INT32_MIN / 10 > num)) || (flag == 1 && INT32_MAX / 10 < num)) {
            return 0;
        }*/
        sum = sum * 10 + x % 10;
        x /= 10;
        LOGI(TAG, "sum=%d", sum)
    }
    return (sum > INT_MAX || sum < INT_MIN) ? 0 : sum;
}

int Easy::add(int a, int b) {
    return a + b;
}
