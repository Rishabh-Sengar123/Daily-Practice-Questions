// Last updated: 2/7/2026, 6:32:29 PM
1class Solution {
2    public int numTeams(int[] rating) {
3        int total = 0;
4        for(int i=1; i<rating.length-1; i++){
5            int ls = 0;
6            int lb = 0;
7            int rs = 0;
8            int rb = 0;
9            for(int j=0; j<i; j++){
10                if(rating[j]>rating[i]){
11                    lb++;
12                }else{
13                    ls++;
14                }
15            }
16            for(int j=i+1; j<rating.length ; j++){
17                if(rating[i]>rating[j]){
18                    rs++;
19                }else{
20                    rb++;
21                }
22            }
23            int a = lb*rs;
24            int b = ls*rb;
25
26            total += a + b;
27        }
28        return total;
29    }
30}