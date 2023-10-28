/*
 * 155. Min Stack :- leetcode
 * 
* Example 1:
Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2

 */

import java.util.Stack;

public class minStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();

    
    public void push(int val){
        if(st.size() == 0){
            st.push(val);
            min.push(val);
            return;
        }
        st.push(val);
        int temp = Math.min(val, min.peek());
        min.push(temp);
    }
    public void pop(){
        st.pop();
        min.pop();
    }
    public int top(){
        return st.peek();
    }
    public int getMin(){
        return min.peek();
    }
}
