// Last updated: 10/1/2025, 3:31:57 PM
class Solution {
    public boolean isBalanced(String num) {
        int sum = 0;
        for(int i=0; i<num.length(); i+=2){
            sum += num.charAt(i) - '0';
        }
        int fam = 0;
        for(int i=1; i<num.length() ; i+=2){
            fam += num.charAt(i) - '0';
        }
        if(fam == sum){
            return true;
        }else{
            return false;
        }
    }
}