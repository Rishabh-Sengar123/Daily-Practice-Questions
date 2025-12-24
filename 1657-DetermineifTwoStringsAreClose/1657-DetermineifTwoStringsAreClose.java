// Last updated: 12/24/2025, 6:57:17 PM
1class Solution {
2    public boolean closeStrings(String word1, String word2) {
3        if (word1.length() != word2.length()) return false;
4
5        int[] f1 = new int[26];
6        int[] f2 = new int[26];
7
8        for (char c : word1.toCharArray()) f1[c - 'a']++;
9        for (char c : word2.toCharArray()) f2[c - 'a']++;
10
11        Set<Character> set = new HashSet<>();
12        for(char ch : word1.toCharArray()){
13            set.add(ch);
14
15        }
16        Set<Character> set2 = new HashSet<>();
17        for(char ch : word2.toCharArray()){
18            set2.add(ch);
19        }
20        if(!set.equals(set2)){
21            return false;
22        }
23        Arrays.sort(f1);
24        Arrays.sort(f2);
25
26        return Arrays.equals(f1, f2);
27    }
28}
29