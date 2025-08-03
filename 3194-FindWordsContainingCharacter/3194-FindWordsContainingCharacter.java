// Last updated: 8/3/2025, 9:52:51 AM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> fuckingList = new ArrayList<>();
        for(int i = 0; i<words.length; i++){
            if(words[i].indexOf(x)!= -1){
                fuckingList.add(i);
            }
        } 
        return fuckingList;
    }
}