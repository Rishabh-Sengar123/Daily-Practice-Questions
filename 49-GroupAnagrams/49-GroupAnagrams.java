// Last updated: 2/12/2026, 12:37:56 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String,List<String>> map = new HashMap<>();
4        for(String word : strs){
5            char[] ch = word.toCharArray();
6            Arrays.sort(ch);
7            String s = new String(ch);
8
9            if(!map.containsKey(s)){
10                map.put(s, new ArrayList<>());
11            }
12            map.get(s).add(word);
13        }
14        return new ArrayList<>(map.values());
15    }
16}