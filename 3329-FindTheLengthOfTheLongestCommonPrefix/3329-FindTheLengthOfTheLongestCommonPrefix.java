// Last updated: 2/10/2026, 3:18:13 PM
class Solution {
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
                    maxlen = Math.max(maxlen,(int) Math.log10(temp) + 1);
                }
                temp/=10;
            }
        }
        return maxlen;
    }
}