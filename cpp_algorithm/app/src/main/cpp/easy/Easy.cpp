//
// Created by DuQian on 5/29/21.
//
#include "Easy.h"
#include <unordered_map>
#include <map>

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
    return x == result;
}

int Easy::romanToInt(string s) {
    map<char, int> map;
    map['I'] = 1;
    map['V'] = 5;
    map['X'] = 10;
    map['L'] = 50;
    map['C'] = 100;
    map['D'] = 500;
    map['M'] = 1000;
    if (s == "") return 0;
    int length = s.length();
    int result = 0;
    int currentIndex = 0;
    for (int i = 0; i < length; ++i) {
        if (i > 0 && i == currentIndex)continue;//少一次逻辑运算
        int num = map[s[i]];
        if (i < length - 1 && num < map[s[i + 1]]) {
            //result -= num;
            result += (map[s[i + 1]] - num);
            currentIndex = i + 1;
        } else {
            result += num;
        }
    }
    return result;
}
