// Last updated: 2/10/2026, 3:18:39 PM
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int sum = 0;
        for(int i=0; i<derived.length; i++){
            sum^=derived[i];
        }
        return sum==0;
        
    }
}