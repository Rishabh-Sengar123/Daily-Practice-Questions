// Last updated: 8/3/2025, 9:53:28 AM
class Solution {
    public int numOfPairs(String[] nums, String target) {
        int s_x = 0;
        for(int i = 0; i< nums.length ; i++){
            for(int j = 0; j < nums.length ; j++){
                if(i != j && nums[i].concat(nums[j]).equals(target)){
                    s_x++;
                }
            }
        }
        return s_x;

    }
}