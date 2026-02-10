// Last updated: 2/10/2026, 3:22:55 PM
class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b) -> map.get(b) - map.get(a));
        StringBuilder ans = new StringBuilder();
        for(char c : list){
            for(int i=0; i<map.get(c); i++){
                ans.append(c);
            }
        }
        return ans.toString();
    }
}