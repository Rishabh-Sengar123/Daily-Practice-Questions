// Last updated: 1/25/2026, 10:11:08 AM
1class Solution {
2    public int maxProfit(int[] inventory, int orders) {
3        
4        TreeMap<Long, Long> treeMap = new TreeMap<>(); // <The number of balls of specific color, Count>
5        
6        for (int number : inventory)
7            treeMap.put((long)number, treeMap.getOrDefault((long)number, 0L) + 1);
8        
9        long result = 0, mod = (long)Math.pow(10, 9) + 7;
10        
11        while (orders > 0)
12        {
13            Map.Entry<Long, Long> maxEntry = treeMap.pollLastEntry();
14            long maxNumber = maxEntry.getKey(), maxCount = maxEntry.getValue(), subMaxNumber = 0;
15            
16            if (!treeMap.isEmpty())
17                subMaxNumber = treeMap.lastKey();
18            
19            long totalCount = (maxNumber - subMaxNumber) * maxCount;
20            
21            if (orders >= totalCount)
22            {
23                long n = maxNumber - subMaxNumber, a1 = maxNumber, an = subMaxNumber + 1; 
24            
25                result = (result + n * (a1 + an) / 2 * maxCount) % mod; // Note: Sum of arithmetic sequence n * (a1 + an) / 2
26                orders -= n * maxCount;
27                
28                treeMap.put(subMaxNumber, treeMap.getOrDefault(subMaxNumber, 0L) + maxCount); // Get the orders until maxNumber equals subMaxNumber
29            }
30            else
31            {
32                long n = orders / maxCount, a1 = maxNumber, an = a1 - n + 1;
33                
34                result = (result + n * (a1 + an) / 2 * maxCount) % mod;
35                orders -= n * maxCount;
36                
37                result = (result + orders * (an - 1)) % mod;
38                break; // orders = 0
39            }
40        }
41        
42        return (int)result;
43    }
44}