// Last updated: 8/3/2025, 9:52:55 AM
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i=low; i<high+1; i++){

            String s = Integer.toString(i);
            int sum1 = 0;
            int sum2 = 0;
            if(s.length()%2==0){
                int mid = s.length()/2;
                for (int j = 0; j < mid; j++) {
                    sum1 += s.charAt(j) - '0';        
                    sum2 += s.charAt(j + mid) - '0';   
                }
                if(sum1==sum2){
                    count++;
                }
            }else{
                continue;
            }
        }
        return count;
    }
}