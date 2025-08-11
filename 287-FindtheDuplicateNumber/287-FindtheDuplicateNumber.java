// Last updated: 8/11/2025, 10:48:22 PM
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(!Character.isLetter(arr[left])){
                left++;
            }else if(!Character.isLetter(arr[right])){
                right--;
            }else{
                char temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}