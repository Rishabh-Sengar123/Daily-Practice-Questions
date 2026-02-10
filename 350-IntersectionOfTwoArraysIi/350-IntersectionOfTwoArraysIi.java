// Last updated: 2/10/2026, 3:23:15 PM
/*First part of this question doesnt allows repetion we put i in set and get all the commmon termss one time only*/

/*This question want all the answer exact same with repetions also i want all the common Integers*/
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums1){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int num : nums2){
            if(map.containsKey(num)  && map.get(num)>0){
                list.add(num);
                map.put(num, map.get(num)-1);
            }
        }
        int[] arr = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}