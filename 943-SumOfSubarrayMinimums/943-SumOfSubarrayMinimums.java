// Last updated: 2/10/2026, 3:21:41 PM
class Solution {
    public int sumSubarrayMins(int[] a) {
        long M = 1_000_000_007L, ans = 0;
        int n = a.length;
        int[] L = new int[n], R = new int[n];
        java.util.Stack<Integer> s = new java.util.Stack<>();

        for(int i=0;i<n;i++){
            while(!s.empty() && a[s.peek()]>a[i]) s.pop();
            L[i]= s.empty()? i+1 : i-s.peek();
            s.push(i);
        }
        s.clear();
        for(int i=n-1;i>=0;i--){
            while(!s.empty() && a[s.peek()]>=a[i]) s.pop();
            R[i]= s.empty()? n-i : s.peek()-i;
            s.push(i);
        }
        for(int i=0;i<n;i++)
            ans=(ans + (long)a[i]*L[i]*R[i])%M;

        return (int)ans;
    }
}
