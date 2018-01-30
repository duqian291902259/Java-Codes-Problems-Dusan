package site.duqian.problems.leetcode.easy;

/**
 * Description:
 * Say you have an array for which the ith element is the price of
 * a given stock on day i.
 * Design an algorithm to find the maximum profit.
 * You may complete as many transactions as you like
 * (ie, buy one and sell one share of the stock multiple times).
 * However, you may not engage in multiple transactions at the same time
 * (ie, you must sell the stock before you buy again).
 * <p>
 * 本题由于是可以操作任意次数，只为获得最大收益，而且对于一个上升子序列，
 * 比如：[5, 1, 2, 3, 4]中的1, 2, 3, 4序列来说，对于两种操作方案：
 * 1 在1买入，4卖出
 * 2 在1买入，2卖出同时买入，3卖出同时买入，4卖出
 * 这两种操作下，收益是一样的。所以可以从头到尾扫描prices，
 * 如果price[i] – price[i-1]大于零则计入最后的收益中。即贪心法
 *
 * @author 杜乾-Dusan,Created on 2018/1/25 - 14:38.
 *         E-mail:duqian2010@gmail.com
 */
public class BuyAndSellStockII {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int profit = 0;
        int len = prices.length;
        for (int i = 1; i < len; i++) {
            //从第二天开始计算收益
            int diff = prices[i] - prices[i-1];
            if (diff > 0) {
                profit += diff;
            }
        }
        return profit;
    }
}
