// Last updated: 8/5/2025, 9:55:39 PM
class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean ans = false;
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                count++;
            }
            if(count%2==0 && count != 0){
                ans = true;
                return ans;
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length;j++){
                if(arr[i]*2 == arr[j] && arr[i] != 0){
                    ans = true;
                }
            }
        }
        return ans;
    }
}