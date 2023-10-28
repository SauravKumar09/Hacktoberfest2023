/*
 * 84. Largest Rectangle in Histogram :- leetcode
 
Example 1:
Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.

Example 2:
Input: heights = [2,4]
Output: 4
 */

import java.util.Stack;


public class largestRectangleHistogram {
    public int largestRectangleArea(int[] arr)
    {
        Stack<Integer> s = new Stack<>();
        int omax = 0;

        for(int i=0; i<=arr.length; i++){
            int temp;
            if(i==arr.length){
                temp = 0;
            }else{
                temp = arr[i];
            }
            while(s.size()>0 && temp<arr[s.peek()]){
                int tbs = s.pop();
                int nsr = i;
                int nsl;
                if(s.size() == 0){
                    nsl = -1;
                }else{
                    nsl = s.peek();
                }
                int width = nsr-nsl-1;
                omax = Math.max(omax, width*arr[tbs]);
            }
            s.push(i);
        }
        return omax;
    }
}
