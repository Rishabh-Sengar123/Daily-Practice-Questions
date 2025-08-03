// Last updated: 8/3/2025, 10:43:48 AM
class Solution {
    public boolean isValid(String s) {
        int[] arr = new int[s.length()];
        int total = -1;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                arr[++total]=')';
            }else if(ch=='{'){
                arr[++total]='}';
            }else if(ch=='['){
                arr[++total]=']';
            }else if(total == -1  || arr[total--] != ch){
                return false;
            }
        }
        return total == -1;
    }
}