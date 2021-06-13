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
    long sum = 0;
    while (x) {
        sum = sum * 10 + x % 10;
        x /= 10;
    }
    return (sum > INT_MAX || sum < INT_MIN) ? 0 : sum;
}

bool Easy::isPalindrome(int x) {
    if (x < 0) {
        return false;
    }
    int result = Easy::reverse(x);
    LOGI(TAG, "easy_test reverse %d, %d", x, result)

    return x == result;
}
