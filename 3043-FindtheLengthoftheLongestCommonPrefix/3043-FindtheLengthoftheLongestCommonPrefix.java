// Last updated: 9/1/2025, 8:56:52 PM
class Solution {
    private int digitCount(int num) {
        int len = 0;
        while (num > 0) {
            len++;
            num /= 10;
        }
        return len;
    }
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr1){
            int temp = num;
            while(temp>0){
                set.add(temp);
                temp /= 10;
            }
        }
        int maxlen  = 0;
        for(int num : arr2){
            int temp = num;
            while(temp>0){
                if(set.contains(temp)){
                    maxlen = Math.max(maxlen, digitCount(temp));
                }
                temp/=10;
            }
        }
        return maxlen;
    }
}