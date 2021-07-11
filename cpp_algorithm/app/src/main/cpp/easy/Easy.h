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
#include "common.h"

using namespace std;

/**
 * 头文件里面定义算法的方法和注释，静态的方法。
 * 力扣:  https://leetcode-cn.com/problemset/all/?difficulty=%E7%AE%80%E5%8D%95
 * 注释包含题库里面的标题和简单描述
 *  Created by duqian2010@gmail.com on 5/29/21.
 */
class Easy {
private:
    const string LOG_TAG = "DQ";
public:

    /**
     * 1，两数之和
     * 输入：nums = [2,7,11,15], target = 9,输出：[0,1]
     * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1]
     */
    static std::vector<int> twoSum(std::vector<int> &nums, int target);

    static std::vector<int> twoSum2(std::vector<int> &nums, int target);

    /**
     * 7,整数反转
     给定一个 32 位有符号整数，将整数中的数字进行反转。
     * 输入: -123 输出: -321  输入: 120  输出: 21
     */
    static int reverse(int32_t x);

    /**
    * 9,回文数
     * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
    */
    static bool isPalindrome(int x);

    /**
     * 13. 罗马数字转整数
     * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
     * 数值 I-1 V-5 X-10 L-50 C-100 D-500 M-1000
     * @param s 输入: "MCMXCIV"
     * @return 输出: 1994
     */
    static int romanToInt(string s);


    /**
     * 编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回空字符串 ""。
     * @param strs 输入：strs = ["flower","flow","flight"]
     * @return 输出："fl"
     */
    static string longestCommonPrefix(vector<string> &strs);

    /**
     * 20. 有效的括号
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
     * 有效字符串需满足：左括号必须用相同类型的右括号闭合,左括号必须以正确的顺序闭合。
     * @param s  输入：s = "()[]{}"
     * @return 输出：true
     */
    static bool isValidPunctuation(string s);

    /**
     * 26. 删除有序数组中的重复项
     * 函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
     * @param nums  输入：nums = [1,1,2]
     * @return 输出：2, nums = [1,2]
     */
    static int removeDuplicates(vector<int> &nums);

    /**
     * 输入：nums = [3,2,2,3], val = 3
        输出：2, nums = [2,2]
        解释：函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。你不需要考虑数组中超出新长度后面的元素。例如，函数返回的新长度为 2 ，而 nums = [2,2,3,3] 或 nums = [2,2,0,0]，也会被视作正确答案。
        链接：https://leetcode-cn.com/problems/remove-element
     */
    static int removeElement(vector<int> &nums, int val);


    static ListNode *mergeTwoLists(ListNode *l1, ListNode *l2);

protected:
    int num = 0;
};

#endif //CPP_ALGORITHM_H
