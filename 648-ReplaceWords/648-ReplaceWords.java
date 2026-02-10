// Last updated: 2/10/2026, 3:22:24 PM
class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String> set = new HashSet<>();
        for(String s : dictionary) set.add(s);

        int len = sentence.length();
        String data[] = sentence.split(" ");

        int n = data.length;
        for(int i=0;i<n;i++){
            String s = data[i];
            for(int j=1;j<=s.length();j++){
                if(set.contains(s.substring(0,j))) {
                    data[i] = s.substring(0,j);
                    break;
                }
            }
        }

        String ans = String.join(" ",data);
        return ans;
    }
}