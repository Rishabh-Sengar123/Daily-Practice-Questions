// Last updated: 2/10/2026, 3:21:08 PM
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++){
            int diff = arr[i]-arr[i-1];
            minDiff = Math.min(minDiff, diff);
        }
        for(int i=1; i<arr.length; i++){
            List<Integer> list = new ArrayList<>();
            if(arr[i]-arr[i-1] == minDiff){
                list.add(arr[i-1]);
                list.add(arr[i]);
                result.add(list);
            }
        }
        return result;
    }
}