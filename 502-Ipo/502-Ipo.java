// Last updated: 8/25/2025, 11:41:02 PM
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int[][] arr=new int[profits.length][2];
        for(int i=0;i<arr.length;i++)
        {
            arr[i][0]=capital[i];
            arr[i][1]=profits[i];
        }
        return IPO(arr,k,w);
    }
    public int IPO(int[][] arr,int k,int w)
    {
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        PriorityQueue<int []>pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        int i=0;
        while (k > 0) {
            while (i < arr.length && w >= arr[i][0]) {
                pq.add(arr[i]);
                i++;
            }
            if (pq.isEmpty()) break;
            w += pq.poll()[1];
            k--;
        }
        return w;
    }
}