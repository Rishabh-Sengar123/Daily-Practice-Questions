// Last updated: 8/20/2025, 10:34:40 AM
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
