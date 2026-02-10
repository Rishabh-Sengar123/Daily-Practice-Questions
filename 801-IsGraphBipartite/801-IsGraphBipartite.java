// Last updated: 2/10/2026, 3:22:02 PM
class Solution{
    public boolean isBipartite(int[][] graph)
    {
        Queue<BipartitePair>q=new LinkedList<>();
        HashMap<Integer,Integer>visited=new HashMap<>();
        for(int i=0;i<graph.length;i++)//vertex
        {
            if(visited.containsKey(i)) continue;
            q.add(new BipartitePair(i,0));
            while(!q.isEmpty())
            {
                // 1.remove
                BipartitePair rp=q.poll();
                // 2.ignore if already visited
                if(visited.containsKey(rp.vertex)){
                    if(visited.get(rp.vertex)!=rp.distance) return false;
                    continue;
                }
                // 3.mark visited
                visited.put(rp.vertex,rp.distance);
                // 4.self work
                // 5.add unvisited neighbours
                for(int neighbours:graph[rp.vertex])
                {
                    if(!visited.containsKey(neighbours))
                    {
                        q.add(new BipartitePair(neighbours,rp.distance+1));
                    }
                }
            }
        }
        return true;
    }
}
class BipartitePair{
    int vertex;
    int distance;
    public BipartitePair(int vertex,int distance)
    {
        this.vertex=vertex;
        this.distance=distance;
    }

}