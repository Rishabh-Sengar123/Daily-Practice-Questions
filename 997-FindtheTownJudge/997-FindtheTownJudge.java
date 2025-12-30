// Last updated: 12/30/2025, 10:40:14 AM
1public class Solution {
2    public int findJudge(int n, int[][] trust) {
3
4        int[] trustIn = new int[n + 1];
5        int[] trustOut = new int[n + 1];
6
7        for (int [] arr : trust){
8            trustIn[arr[1]]++;
9            trustOut[arr[0]]++;
10        }
11
12        for(int i =1; i <= n; i++){
13            if(trustIn[i] == n - 1 && trustOut[i] == 0){
14                return i;
15            }
16        }
17        
18        return -1;
19    }
20}