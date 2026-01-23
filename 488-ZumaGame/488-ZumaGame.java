// Last updated: 1/23/2026, 1:11:44 PM
1class Solution {
2    private static final String END = "$";
3    public int findMinStep(String board, String hand) {
4        final Map<Character, Integer> map = new HashMap<>();
5        for (char c : hand.toCharArray()) {
6            map.put(c, map.getOrDefault(c, 0) + 1);
7        }
8        final Set<String> visited = new HashSet<>();
9        final Queue<String[]> queue = new LinkedList<>();
10        queue.offer(new String[]{board + END, hand});
11        int level = 0;
12        while (!queue.isEmpty()) {
13            final int currentSize = queue.size();
14            for (int size = 0; size < currentSize; size++) {
15                final String[] currentPair = queue.poll();
16                final String nowBoard = removeSame(currentPair[0]);
17                if (nowBoard.equals(END)) {
18                    return level;
19                }
20                final String nowHand = currentPair[1];
21                for (int i = 0; i < nowBoard.length(); i++) {
22                    for (char h : nowHand.toCharArray()) {
23                        if (1 == map.getOrDefault(h, 0) && i > 1 && i < nowBoard.length() - 1
24                            && nowBoard.charAt(i) != h && h != nowBoard.charAt(i + 1)) {
25                            continue;
26                        }
27                        final String newString =
28                            nowBoard.substring(0, i) + h + nowBoard.substring(i);
29                        if (!visited.contains(newString)) {
30                            final String newHand = removeCharFromHand(nowHand, h);
31                            visited.add(newString);
32                            queue.offer(new String[]{newString, newHand});
33                        }
34                    }
35                }
36            }
37            ++level;
38        }
39        return -1;
40    }
41
42    private String removeCharFromHand(String hand, char c) {
43        final StringBuilder handBuild = new StringBuilder(hand);
44        for (int i = 0; i < handBuild.length(); i++) {
45            if (handBuild.charAt(i) == c) {
46                handBuild.deleteCharAt(i);
47                break;
48            }
49        }
50        return handBuild.toString();
51    }
52
53    private String removeSame(String s) {
54        if (s.isEmpty()) {
55            return s;
56        }
57        int start = 0;
58        for (int i = 0; i < s.length(); i++) {
59            if (s.charAt(i) == s.charAt(start)) {
60                continue;
61            }
62            if (i - start >= 3) {
63                return removeSame(s.substring(0, start) + s.substring(i));
64            } else {
65                start = i;
66            }
67        }
68        return s;
69    }
70}