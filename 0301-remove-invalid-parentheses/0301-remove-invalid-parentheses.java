import java.util.*;

class Solution {

    public List<String> removeInvalidParentheses(String s) {

        List<String> ans = new ArrayList<>();

        int open = 0;
        int close = 0;

        // Find extra '(' and ')'
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                open++;
            }
            else if(s.charAt(i) == ')')
            {
                if(open > 0)
                {
                    open--;
                }
                else
                {
                    close++;
                }
            }
        }

        HashSet<String> set = new HashSet<>();

        solve(s, 0, open, close, set);

        for(String x : set)
        {
            ans.add(x);
        }

        return ans;
    }

    public void solve(String s, int index, int open, int close,
                      HashSet<String> set)
    {
        if(open == 0 && close == 0)
        {
            if(valid(s))
            {
                set.add(s);
            }

            return;
        }

        for(int i = index; i < s.length(); i++)
        {
            // Don't remove the same consecutive parenthesis repeatedly
            if(i != index && s.charAt(i) == s.charAt(i - 1))
            {
                continue;
            }

            // Remove extra ')'
            if(close > 0 && s.charAt(i) == ')')
            {
                String newString = s.substring(0, i) +
                                   s.substring(i + 1);

                solve(newString, i, open, close - 1, set);
            }

            // Remove extra '('
            if(open > 0 && s.charAt(i) == '(')
            {
                String newString = s.substring(0, i) +
                                   s.substring(i + 1);

                solve(newString, i, open - 1, close, set);
            }
        }
    }

    public boolean valid(String s)
    {
        int count = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                count++;
            }
            else if(s.charAt(i) == ')')
            {
                count--;

                if(count < 0)
                {
                    return false;
                }
            }
        }

        return count == 0;
    }
}