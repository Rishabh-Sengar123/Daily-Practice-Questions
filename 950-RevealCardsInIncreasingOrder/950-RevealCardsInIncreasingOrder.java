// Last updated: 1/30/2026, 1:21:07 PM
1class Solution {
2    public int[] deckRevealedIncreasing(int[] deck) {
3        Arrays.sort(deck);
4        Deque<Integer> deque = new LinkedList<>();
5        
6        for (int i = deck.length - 1; i >= 0; i--) {
7            if (!deque.isEmpty()) {
8                deque.addFirst(deque.removeLast());
9            }
10            deque.addFirst(deck[i]);
11        }
12        
13        return deque.stream().mapToInt(i -> i).toArray();
14    }
15}
16