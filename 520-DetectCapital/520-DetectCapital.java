// Last updated: 8/3/2025, 9:54:18 AM
class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        char ch;
        char ch1=word.charAt(0);
        for(int i = 0; i< word.length() ; i++){
            ch = word.charAt(i);
            if(Character.isUpperCase(ch))
            {
                count++;
            }
        }
        if(count==word.length())
        {
            return true;
        }
        else if (count==0)
        {
            return true;
        }
        else if(count==1 && Character.isUpperCase(ch1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}