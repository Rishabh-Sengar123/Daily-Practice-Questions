// Last updated: 2/3/2026, 2:25:58 PM
1class Solution {
2    public int minLength(String s) {
3        StringBuilder sb=new StringBuilder(s);
4        boolean changed=true;
5        while(changed){
6            changed=false;
7        
8        for(int i=0;i<sb.length()-1;i++){
9            if(sb.charAt(i)=='A' && sb.charAt(i+1)=='B' || sb.charAt(i)=='C' && sb.charAt(i+1)=='D'){
10                sb.delete(i,i+2);
11                changed=true;
12                break;
13            }
14        }
15        }
16        return sb.length();
17    }
18}