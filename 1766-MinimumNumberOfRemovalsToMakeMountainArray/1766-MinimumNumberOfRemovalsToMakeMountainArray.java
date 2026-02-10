// Last updated: 2/10/2026, 3:20:29 PM
class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n=nums.length ;
        if (n< 3) return 0;
        int [] lis=LIS(nums);
        int [] lds=LDS(nums);
        int ans =0;
        for(int i=0;i<n;i++){
            if(lis[i]>1 && lds[i]>1)
            {
            ans=Math.max(ans,lis[i]+lds[i]-1);
            }
        }
        return n-ans;
    }
    public int [] LIS(int [] arr){
       int n=arr.length;
        int [] dp=new int[n];
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[i]>arr[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        return dp;
    }
    public int[] LDS(int [] arr){
        int n=arr.length;
        int [] dp=new int[n];
        Arrays.fill(dp,1);
        for(int i=n-2;i>=0;i--){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        return dp;
    }
}