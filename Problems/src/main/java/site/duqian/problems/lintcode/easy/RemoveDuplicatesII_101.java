package site.duqian.problems.lintcode.easy;

/**
 * Description:
 * 跟进“删除重复数字”：排序数组去重，可以允许出现两次重复
 * 样例
 * 给出数组A =[1,1,1,2,2,3]，你的函数应该返回长度5，此时A=[1,1,2,2,3]。
 *
 * @author 杜乾-Dusan,Created on 2018/1/29 - 18:19.
 *         E-mail:duqian2010@gmail.com
 */
public class RemoveDuplicatesII_101 {
    /**
     * @param nums: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int len = nums.length;
        int index = 1;
        int count = 1;
        for (int i = 1; i < len; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
                count = 1;
            } else if (nums[i] == nums[i - 1]) {
                if (count >= 2) {
                    continue;
                } else {
                    nums[index] = nums[i];
                    index++;
                    count = 2;
                }
            }
        }
        return index;
    }

    public int removeDuplicatesI(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int len = nums.length;
        int index = 1;
        for (int i = 1; i < len; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
