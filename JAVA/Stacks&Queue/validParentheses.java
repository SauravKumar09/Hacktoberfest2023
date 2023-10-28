/*
20. Valid Parentheses :- leetcode
 * 
Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

 */
import java.util.Stack;


public class validParentheses {
    /**
     * @param s
     * @return
     */
    public boolean isValid(String s){
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);

            if(st.size() == 0 || ch == '(' || ch == '{' || ch == '[')
            {
                st.push(ch);
            }
            else{
                if((ch == ')' && st.peek() == '(') || (ch == '}' && st.peek() == '{') || (ch == ']' && st.peek() == '['))
                {
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(st.size() == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
