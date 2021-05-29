//
// Created by DuQian on 5/29/21.
//
#include "easy.h"
#include <unordered_map>

using namespace std;

vector<int> easy::twoSum(vector<int> &nums, int target) {
    for (int i = 0; i < nums.size(); ++i) {
        for (int j = i + 1; j < nums.size(); ++j) {
            if (nums[i] + nums[j] == target) {
                return {i, j};
            }
        }
    }
    return {};
}

vector<int> easy::twoSum2(vector<int> &nums, int target) {
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

int easy::add(int a, int b) {
    return a + b;
}
