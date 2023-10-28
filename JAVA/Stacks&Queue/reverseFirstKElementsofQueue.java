/*
 * Reverse First K elements of Queue :- GFG
 
For Input: 
5 3
1 2 3 4 5
Your Output: 
3 2 1 4 5
Expected Output: 
3 2 1 4 5

 */

import java.util.Queue;
import java.util.Stack;

public class reverseFirstKElementsofQueue {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k){
        int n = q.size();
        Stack<Integer> st = new Stack<>();

        for(int i=1; i<=k; i++){
            st.push(q.remove());
        }
        while(st.size() > 0){
            q.add(st.pop());
        }
        for(int i=1; i<n-k; i++){
            q.add(q.remove());
        }
        return q;
    }
}
