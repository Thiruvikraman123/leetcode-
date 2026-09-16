class Solution {
    public String reverseWords(String s) {
        String[] parts=s.trim().split("\\s+");
        String ans="";
        for(int i=parts.length-1;i>=0;i--)
        {
            ans+=parts[i];

            if(i!=0)
            {
                ans=ans+" ";
            }
        }
        return ans;
        
    }
}