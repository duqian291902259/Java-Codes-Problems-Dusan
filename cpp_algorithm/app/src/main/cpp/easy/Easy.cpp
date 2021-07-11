//
// Created by DuQian on 5/29/21.
//
#include "Easy.h"
#include <unordered_map>
#include <map>
#include <stack>

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

static string longestPrefix(string &string1, string &string2) {
    int length = min(string1.size(), string2.size());
    int index = 0;
    for (int i = 0; i < length; i++) {
        if (string1[i] == string2[i]) {
            index++;
        } else {
            break;
        }
    }
    if (index == 0) {
        return "";
    }
    return string1.substr(0, index);
}


string Easy::longestCommonPrefix(vector<string> &strs) {
    if (strs.empty()) {
        return "";
    }
    string prefix = strs[0];
    for (int i = 0; i < strs.size(); i++) {
        prefix = longestPrefix(prefix, strs[i]);
        if (prefix.empty()) {
            return "";
        }
    }
    return prefix;
}

bool Easy::isValidPunctuation(string s) {
    if (s.empty() || s.size() % 2 != 0) return false;
    map<char, char> map1 = map<char, char>();
    map1['('] = ')';
    map1['{'] = '}';
    map1['['] = ']';
    unordered_map<char, char> map2 = {
            {')', '('},
            {']', '['},
            {'}', '{'}
    };
    stack<char> sta;
    for (char cha:s) {
        if (cha == '[' || cha == '{' || cha == '(') {//匹配到左括号
            sta.push(cha);//放入栈中
        } else if (cha == ']' || cha == '}' || cha == ')') {//匹配到右括号
            //if (!sta.empty() && map2[cha] == sta.top()) {
            if (!sta.empty() && map1[sta.top()] == cha) {
                sta.pop();
            } else {
                return false;
            }
        }
    }
    return sta.empty();
}

int Easy::removeDuplicates(vector<int> &nums) {
    if (nums.size() < 2) {
        return nums.size();
    }
    /*int index = 0;
    for (int i = 0; i < nums.size(); i++) {
        int current = nums[i];
        if (i < nums.size() - 1) {
            int next = nums[i + 1];
            if (current != next) {
                nums[index] = current;
                index++;
            }
        } else {
            nums[index] = current;
        }
    }
    return index + 1;*/

    int index = 0;
    for (int i = 0; i < nums.size(); i++) {
        int current = nums[i];
        if (current != nums[index]) {
            nums[++index] = current;
        }
    }
    return index++;
}

int Easy::removeElement(vector<int> &nums, int val) {
    int index = 0;
    for (int i = 0; i < nums.size(); i++) {
        int current = nums[i];
        if (current != val) {
            nums[index++] = current;
        }
    }
    return index++;
}
