// Last updated: 8/15/2025, 9:48:41 AM
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> ll=new ArrayList<>();
        post(root, ll);
        return ll;
       
    }
    public void post(Node root,List<Integer> ll){
         if(root==null){
            return ;
        }
        for (Node child : root.children) {
            post(child, ll);
        }
        ll.add(root.val);
    }
}