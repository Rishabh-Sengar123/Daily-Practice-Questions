// Last updated: 8/3/2025, 9:54:23 AM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ch = magazine.toCharArray();
        char[] ch2 = ransomNote.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        int count = 0;
        for(int i=0; i < ch.length; i++){
            if(count < ch2.length && ch2[count]==ch[i]){
                count++;
            }
        }
        return count==ch2.length;
    }
}