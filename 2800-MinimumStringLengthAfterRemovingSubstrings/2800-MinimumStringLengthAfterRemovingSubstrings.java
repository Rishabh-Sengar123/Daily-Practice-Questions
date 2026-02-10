// Last updated: 2/10/2026, 3:18:38 PM
class Solution {
    public int minLength(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
                continue;
            }
            if(s.charAt(i)=='B' && st.peek()=='A'){
                st.pop();
            }
            else if(s.charAt(i)=='D' && st.peek()=='C'){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        return st.size();
    }
}