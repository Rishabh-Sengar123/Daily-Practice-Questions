// Last updated: 1/5/2026, 12:52:23 PM
1import java.util.*;
2
3class Solution {
4    public int eraseOverlapIntervals(int[][] intervals) {
5        if (intervals.length == 0) return 0;
6
7        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
8
9        int count = 0;
10        int prevEnd = intervals[0][1];
11
12        for (int i = 1; i < intervals.length; i++) {
13            if (intervals[i][0] < prevEnd) {
14             
15                count++;
16            } else {
17                prevEnd = intervals[i][1];
18            }
19        }
20        return count;
21    }
22}
23