package site.duqian.problems.lintcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:给出一个无重叠的按照区间起始端点排序的区间列表。
 * 在列表中插入一个新的区间，你要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。
 * 插入区间[2, 5] 到 [[1,2], [5,9]]，我们得到 [[1,9]]。
 * <p>
 * 插入区间[3, 4] 到 [[1,2], [5,9]]，我们得到 [[1,2], [3,4], [5,9]]。
 * <p>
 * 输入
 * [[1,5],[7,8],[10,13]]
 * [6,6]
 * 期望答案
 * [[1,5],[6,6],[7,8],[10,13]]
 *
 * @author 杜乾-Dusan,Created on 2017/12/15 - 20:01.
 *         E-mail:duqian2010@gmail.com
 */
public class InsertInterval {

    public static class Interval {
        int start, end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "Interval{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }

    /**
     * @param intervals:   Sorted interval list.
     * @param newInterval: new interval.
     * @return: A new interval list.
     */
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        // write your code here
        List<Interval> list = new ArrayList<>();
        if (intervals == null || newInterval == null) {
            return null;
        }
        if (intervals.size() == 0) {
            list.add(newInterval);
            return list;
        }
        int index = 0;//记录插入位置
        int len = intervals.size();
        Interval temp = newInterval;
        for (int i = 0; i < len; i++) {
            index = i;
            Interval interval = intervals.get(i);
            int start = interval.start;
            int end = interval.end;
            int newStart = temp.start;
            int newEnd = temp.end;

            if (newEnd < start) {
                list.add(temp);
                for (int j = i; j < len; j++) {
                    list.add(intervals.get(j));
                }
                break;
            } else if (newStart > end) {
                list.add(interval);
            } else {
                temp.start = Math.min(newStart, start);
                temp.end = Math.max(newEnd, end);
            }

            if (index == len - 1) {
                list.add(temp);//加入最后一个
            }
        }
        return list;
    }
}