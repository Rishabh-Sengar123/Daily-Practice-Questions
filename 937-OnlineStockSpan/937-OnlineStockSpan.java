// Last updated: 2/10/2026, 3:21:44 PM
import java.util.Stack;

class StockSpanner {
    private Stack<int[]> stack;
    
    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        stack.push(new int[]{price, span});
        return span;
    }
}
