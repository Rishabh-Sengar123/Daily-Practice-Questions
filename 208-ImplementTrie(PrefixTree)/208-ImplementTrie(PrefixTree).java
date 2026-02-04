// Last updated: 2/4/2026, 12:23:44 PM
1import java.util.HashMap;
2
3public class Trie{
4    class Node{
5        char ch;
6        boolean isterminal;
7        HashMap<Character, Node> child;
8        public Node(char ch){
9            this.ch = ch;
10            child = new HashMap<>();
11        }
12    }
13    private Node root;
14
15    public Trie(){
16        root = new Node('*');
17    }
18
19    public void insert(String word){
20        Node curr = root;
21        for (int i = 0; i < word.length(); i++) {
22            char ch = word.charAt(i);
23            if (curr.child.containsKey(ch)) {
24                curr = curr.child.get(ch);
25            }
26            else{
27                Node nn = new Node(ch);
28                curr.child.put(ch, nn);
29                curr = nn;
30            }
31        }
32        curr.isterminal = true;
33    }
34    public boolean search(String word){
35        Node curr = root;
36        for (int i = 0; i < word.length(); i++) {
37            char ch = word.charAt(i);
38            if (curr.child.containsKey(ch)) {
39                curr = curr.child.get(ch);
40            }
41            else{
42                return false;
43            }
44        }
45        return curr.isterminal;
46    }
47    public boolean startsWith(String prefix){
48        Node curr = root;
49        for (int i = 0; i < prefix.length(); i++) {
50            char ch = prefix.charAt(i);
51            if (curr.child.containsKey(ch)) {
52                curr = curr.child.get(ch);
53            }
54            else{
55                return false;
56            }
57        }
58        return true;
59    }
60}