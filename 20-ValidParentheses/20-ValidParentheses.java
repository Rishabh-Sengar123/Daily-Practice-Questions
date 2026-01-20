// Last updated: 1/20/2026, 8:13:40 PM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack<>();
4
5        for(char ch : s.toCharArray()){
6            if(ch=='(' || ch == '{' || ch == '['){
7                stack.push(ch);
8            }
9            else{
10                if(stack.isEmpty()){
11                    return false;
12                }
13                char top = stack.pop();
14
15                if((ch == ')' && top != '(') ||
16                    (ch == '}' && top != '{') ||
17                    (ch == ']' && top != '[') ){
18                        return false;
19                    }
20            }
21        }
22        return stack.isEmpty();
23    }
24}