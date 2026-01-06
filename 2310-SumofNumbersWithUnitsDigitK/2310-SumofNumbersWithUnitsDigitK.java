// Last updated: 1/6/2026, 11:13:12 AM
1class Solution
2{
3    public int minimumNumbers(int num, int k)
4    {
5        if(num == 0)
6            return 0;
7        for(int i = 1; i*k <= num && i <= 10; i++) 
8            if(num % 10 == ((i*k)%10)) 
9                return i;
10        
11        return -1;
12    }
13}