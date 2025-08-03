// Last updated: 8/3/2025, 9:53:38 AM
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int leng = arr.length ;
        for(int i = 0; i < leng ; i++){
            if(arr[i] <= k){
                k++;
            }
            else{
                break;
            }
        }
        return k;
    }
}