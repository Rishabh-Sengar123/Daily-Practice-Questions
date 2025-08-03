// Last updated: 8/3/2025, 9:54:01 AM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
         return product_less_than_k(nums,k);
        
        }
        public static int product_less_than_k(int[] nums,int k)
        {
            int ans=0,si=0,ei=0,p=1;
            while(ei<nums.length)
            {
                // grow
                p=p*nums[ei];
                // shrink
                while(p>=k && si<=ei)
                {
                    p=p/nums[si];
                    si++;
                }
                // ans update
                ans=ans+(ei-si +1);
                ei++;
            }
            return ans;
        }
        
    }