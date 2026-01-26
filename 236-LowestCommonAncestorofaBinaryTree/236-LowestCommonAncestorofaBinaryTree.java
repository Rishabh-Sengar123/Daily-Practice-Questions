// Last updated: 1/26/2026, 5:28:25 PM
class Solution {

        private final Deque<Integer> pathToP = new ArrayDeque<>();
        private final Deque<Integer> pathToQ = new ArrayDeque<>();
        private final Map<Integer, TreeNode> nodeByVal = new HashMap<>();

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            find(root, p, new ArrayList<>(), pathToP);
            find(root, q, new ArrayList<>(), pathToQ);

            var value = pathToP.pop();
            while (!pathToQ.contains(value)) {
                value = pathToP.pop();
            }
            return nodeByVal.get(value);
        }

        private void find(TreeNode current, TreeNode toFind, ArrayList<Integer> subResult, Deque<Integer> finalResult) {
            if (current == null) {
                return;
            }

            subResult.add(current.val);
            nodeByVal.put(current.val, current);
            if (current.val == toFind.val) {
                finalResult.addAll(subResult.stream().toList().reversed());
                return;
            }

            find(current.left, toFind, subResult, finalResult);
            find(current.right, toFind, subResult, finalResult);
            subResult.removeLast();
        }
    }