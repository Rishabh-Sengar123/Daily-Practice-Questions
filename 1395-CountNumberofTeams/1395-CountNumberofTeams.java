// Last updated: 1/20/2026, 2:53:29 PM
1class Solution {
2    public int numTeams(int[] rating) {
3        int total = 0;
4        for(int j=1; j<rating.length-1;j++){
5            int leftSmall = 0;
6            int leftBig = 0;
7            int rightSmall = 0;
8            int rightBig = 0;
9            for(int i=0; i<j; i++){
10                if(rating[i]<rating[j]){
11                    leftSmall++;
12                }else{
13                    leftBig++;
14                }
15            }
16            for(int k=j+1; k<rating.length; k++){
17                if(rating[k]<rating[j]){
18                    rightSmall++;
19                }else{
20                    rightBig++;
21                }
22            }
23            int inc = leftSmall * rightBig;
24            int dec = leftBig * rightSmall;
25
26            total += inc + dec;
27        }
28        return total;
29    }
30}