// Last updated: 9/27/2025, 12:33:12 AM
class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
        boolean ans = false;
        for(int i=0; i<nums.length ;i++){
            if(nums[i]==0){
                boolean left = (i==0 || nums[i-1]==0);
                boolean right = (i==nums.length-1 || nums[i+1]==0);
                if(left && right){
                    nums[i] = 1;
                    n--;
                }
            }

        }
        if(n<=0){
            return true;
        }else{
            return false;
        }
    }


}


// class Solution {
//     public boolean canPlaceFlowers(int[] nums, int n) {
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == 0) {
//                 boolean left = (i == 0 || nums[i - 1] == 0);
//                 boolean right = (i == nums.length - 1 || nums[i + 1] == 0);
//                 if (left && right) {
//                     nums[i] = 1;
//                     n--;
//                 }
//             }
//         }

//         return n <= 0;  
//     }
// }