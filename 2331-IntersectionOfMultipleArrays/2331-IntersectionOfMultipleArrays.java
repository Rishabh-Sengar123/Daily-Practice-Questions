// Last updated: 2/10/2026, 3:19:35 PM
class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                int num = nums[i][j];
                map.put(num, map.getOrDefault(num, 0)+1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == nums.length){
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        return list;
    }
}