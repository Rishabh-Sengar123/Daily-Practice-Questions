// Last updated: 2/10/2026, 3:17:23 PM
class Solution {
    public int longestBalanced(int[] nums) {
        int maxLen = 0;
        for(int i=0; i<nums.length; i++){
            HashSet<Integer> even = new HashSet<>();
            HashSet<Integer> odd = new HashSet<>();
            int evenCount = 0;
            int oddCount = 0;
            for(int j=i; j<nums.length; j++){
                int moment = nums[j];
                
                if(!even.contains(moment) && moment%2 == 0){
                    even.add(moment);
                    evenCount++;
                }else if(!odd.contains(moment) && moment%2 != 0){
                    odd.add(moment);
                    oddCount++;
                }
                if(evenCount == oddCount){
                    maxLen = Math.max(maxLen, j-i+1);
                }
            }
        }
        return maxLen;
    

    }
}