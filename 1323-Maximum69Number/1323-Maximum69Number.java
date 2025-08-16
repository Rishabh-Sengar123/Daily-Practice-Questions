// Last updated: 8/16/2025, 12:55:24 PM
class Solution {
    public int maximum69Number (int num) {
       
        char[] set = String.valueOf(num).toCharArray();
        for(int i=0; i<set.length; i++){
            if(set[i]=='6'){
                set[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(set));
    }
}
