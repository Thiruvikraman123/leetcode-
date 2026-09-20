class Solution {
    public int longestPalindrome(String s) {
        int[] freq=new int[126];
        int ans=0;
        for(char ch:s.toCharArray())
        {
            freq[ch]++;
        }
        for(int count:freq)
        {
            ans+=count/2*2;
        }
        if(ans<s.length())
        {
            ans++;
        }
        return ans;
        
    }
}