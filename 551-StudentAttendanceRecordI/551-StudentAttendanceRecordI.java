// Last updated: 8/3/2025, 9:54:09 AM
class Solution {
    public boolean checkRecord(String s) {
        int countL = 0;
        int countA = 0;
        int length = s.length();
        for(int i = 0; i < length; i++){
            if(s.charAt(i)=='A'){
                countA++;
            }else if( i> 1&&s.charAt(i)=='L'&&s.charAt(i-1)=='L'&&s.charAt(i-2)=='L'){
                countL++;
            }
        }
        if(countA>=2 ){
            return false;
        }else if(countL>=1){
            return false;
        }
        return true;

    }
}