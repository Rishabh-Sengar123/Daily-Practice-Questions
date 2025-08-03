// Last updated: 8/3/2025, 9:54:08 AM
class Solution {
    public int countSubstrings(String s) {
    int c=0;
    if(s.length()<=1){
        return 1;
    }
     for(int i=0;i<s.length();i++){
        for(int j=i+1;j<=s.length();j++){
            if(ispal(s.substring(i,j))){
                c++;
            }
        }
     }  
    return c;
    }
   public static boolean ispal(String s){
    int i=0;
    int j=s.length()-1;
    while(i<=j){
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        i++;
        j--;
    }
    return true;
   }
}