// Last updated: 8/3/2025, 9:54:20 AM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int min = Math.min(g.length , s.length);
        int i=0;
        int j=0;
        int ans = 0;
        while(i<g.length && j < s.length){
            if(s[j]>=g[i]){
                ans++;
                i++;
                j++;

            }else{
                j++;
            }
        }
        return ans;

    }
}