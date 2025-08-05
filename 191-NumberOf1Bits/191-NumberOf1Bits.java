// Last updated: 8/5/2025, 10:36:07 PM
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        String binary = Integer.toBinaryString(n);
        for(int i = 0; i< binary.length(); i++){
            if(binary.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}