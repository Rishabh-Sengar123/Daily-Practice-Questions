// Last updated: 2/10/2026, 3:19:30 PM
import java.util.*;
class Solution {
    
    int mod=(int)Math.pow(10,9)+7;
   // String[] keypad={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    int ans=0;
    public int countTexts(String pressedKeys) {
        
        int len=pressedKeys.length();
       int[] dp=new int[len+1];
        
        dp[0]=1;
        System.out.print(dp[0]+" ");
        for(int i=1;i<len+1;i++){
            
            char ch=pressedKeys.charAt(i-1);
          
         
            
             dp[i]=(dp[i]%mod+dp[i-1]%mod)%mod;
            if(i-2>=0 && pressedKeys.charAt(i-2)==ch ){
                
                 dp[i]=(dp[i]%mod+dp[i-2]%mod)%mod;
                
                if(i-3>=0 &&  pressedKeys.charAt(i-3)==ch ){
                    
                    
                        dp[i]=(dp[i]%mod+dp[i-3]%mod)%mod;
                    
                    if((i-4>=0 && pressedKeys.charAt(i-4)==ch)&& (ch=='7' || ch=='9')  ){
                        dp[i]=(dp[i]%mod+dp[i-4]%mod)%mod;
                    }
                }
                
                
            }
            
            
           // System.out.print(dp[i]+" ");
        }
         
        return dp[len];
    }
}
             
                   