class Solution {
    public int smallestNumber(int n, int t) {
        while(true)
        {
            int temp=n;
            int p=1;
            while(temp>0)
            {
                int digit=temp%10;
                p=p*digit;
                temp=temp/10;
            }
            if(p%t==0)
            {
                return n;
            }
            n++;
        }
        
    }
}