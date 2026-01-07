// Last updated: 1/8/2026, 12:16:29 AM
1// Question me 2 variable hai ak apni row and column// isliye apni dp bhi 2 ki bnegi okk.
2class Solution {
3    //Initilize the Dp globally
4    int[][] dp;
5    public List<Integer> getRow(int rowIndex) {
6        List<Integer> result = new ArrayList<>();
7        dp = new int[rowIndex+1][rowIndex+1];
8        //fill dp with the any dummy number
9        for(int i=0; i<=rowIndex; i++){
10            Arrays.fill(dp[i] , -1);
11        }
12        //traverse the loop 
13    /*      col →
14            0   1   2   3
15        row
16        0    1
17        1    1   1
18        2    1   2   1
19        3    1   3   3   1
20        */
21        // We make (3,0) -> base case
22        //We make (3,1) -> (2,0) + (2,1)
23        //We make (3,2) -> (2, 1) + (2, 2)
24        //We make (3,3) -> hit the base case and return 
25        for(int n=0; n<=rowIndex; n++){
26            result.add(solve(rowIndex, n, dp));
27        }
28        return result;
29
30    }
31    public int solve(int row, int n , int[][] dp){
32        //base case
33        if(n == 0 || n == row ){
34            return 1;
35        }
36        //return the calculated values 
37        if(dp[row][n] != -1){
38            return dp[row][n];
39        }
40
41        //dp ko calculate kiya hai 
42        dp[row][n] = solve(row-1, n-1, dp) + solve(row-1, n, dp);
43
44        return dp[row][n];
45    }
46}