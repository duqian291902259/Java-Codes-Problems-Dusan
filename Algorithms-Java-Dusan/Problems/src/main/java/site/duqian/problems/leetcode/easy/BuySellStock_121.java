package site.duqian.problems.leetcode.easy;

/**
 * Description:
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 * <p>
 * Example 1:
 * Input: [7, 1, 5, 3, 6, 4]
 * Output: 5
 * <p>
 * max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
 * Example 2:
 * Input: [7, 6, 4, 3, 1]
 * Output: 0
 * <p>
 * In this case, no transaction is done, i.e. max profit = 0.
 *
 * @author 杜乾-Dusan,Created on 2018/1/10 - 20:58.
 *         E-mail:duqian2010@gmail.com
 */
public class BuySellStock_121 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int len = prices.length;
        int profit = 0;
        int min = prices[0];//最低价
        for (int i = 0; i < len; i++) {
            int price = prices[i];
            if (price < min) {
                min = price;
            }
            int dis = price - min;
            if (profit < dis) {//利润
                profit = dis;
            }
        }
        return profit;
    }
}
