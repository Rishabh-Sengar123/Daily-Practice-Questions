// Last updated: 8/3/2025, 9:54:30 AM
import java.util.*;

public class Solution {
    Map<String, PriorityQueue<String>> graph = new HashMap<>();
    LinkedList<String> result = new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) {
       
        for (List<String> ticket : tickets) {
            String from = ticket.get(0), to = ticket.get(1);
            graph.computeIfAbsent(from, k -> new PriorityQueue<>()).add(to);
        }

        dfs("JFK");

        return result;
    }

    private void dfs(String airport) {
        PriorityQueue<String> arrivals = graph.get(airport);
        while (arrivals != null && !arrivals.isEmpty()) {
            dfs(arrivals.poll());  
        }
        result.addFirst(airport); 
    }
}
