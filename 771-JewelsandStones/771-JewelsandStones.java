// Last updated: 8/24/2025, 7:08:43 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> freq = new HashMap<>();
        for(char ch : stones.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        int sum = 0;
        for(int i=0; i<jewels.length(); i++){
            char target = jewels.charAt(i);
            sum += freq.getOrDefault(target, 0);
        }
        return sum;
    }
}