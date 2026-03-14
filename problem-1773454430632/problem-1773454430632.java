// Last updated: 3/14/2026, 7:43:50 AM
1class Solution {
2    public String getHappyString(int n, int k) {
3        List<String> result = new ArrayList<>();
4        StringBuilder ans = new StringBuilder();
5        backtrack(result, ans, n);
6        if(result.size()>=k){
7            return result.get(k-1);
8        }
9        return "";
10    }
11    private void backtrack(List<String> result, StringBuilder current, int n){
12        if(current.length() == n){
13            result.add(current.toString());
14            return;
15        }
16        for(char c : new char[]{'a', 'b', 'c'}){
17            if(current.length() == 0 || current.charAt(current.length()-1) != c){
18                current.append(c);
19                backtrack(result, current, n);
20                current.deleteCharAt(current.length()-1);
21            }
22        }
23    }
24}