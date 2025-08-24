// Last updated: 8/24/2025, 6:32:04 PM
class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : candyType){
            set.add(num);
        }
        int length = candyType.length;
        if(set.size()>length/2){
            return length/2;
        }else{
            return set.size();
        }
    }
}