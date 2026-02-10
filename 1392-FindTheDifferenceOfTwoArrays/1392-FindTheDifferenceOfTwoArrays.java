// Last updated: 2/10/2026, 3:20:58 PM
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums2){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int num : nums1){
            if(!map.containsKey(num) && !list.contains(num)){
                list.add(num);
            }
        }
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int num : nums1){
            map2.put(num, map2.getOrDefault(num, 0)+1);
        }
        for(int num : nums2){
            if(!map2.containsKey(num) && !list2.contains(num)){
                list2.add(num);
            }
        }
        result.add(list);
        result.add(list2);

        return result;
    }
}