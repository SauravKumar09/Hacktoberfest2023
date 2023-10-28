/*
 * 503. Next Greater Element II :- leetcode
 
Example 1:
Input: nums = [1,2,1]
Output: [2,-1,2]
Explanation: The first 1's next greater number is 2; 
The number 2 can't find next greater number. 
The second 1's next greater number needs to search circularly, which is also 2.

Example 2:
Input: nums = [1,2,3,4,3]
Output: [2,3,4,-1,4]

 */
import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElementII{
    public int[] nextGreaterElement(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();
        Arrays.fill(ans, -1);

        for(int i=0; i<nums.length*2; i++){
            while(st.size()>0 && nums[st.peek()]<nums[i % nums.length])
            {
                ans[st.pop()] = nums[i % nums.length];
            }
            if(i < nums.length){
                st.push(i);
            }
        }
        return ans;
    }
}