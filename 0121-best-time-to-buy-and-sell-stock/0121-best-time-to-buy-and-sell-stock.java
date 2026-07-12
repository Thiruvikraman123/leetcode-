class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int left=0;
        int right=1;

        for(int i=1;i<prices.length;i++)
        {
            if(prices[right]>prices[left])
            {
                int profit=prices[right]-prices[left];
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                left=right;
            }
            right++;
        }
        return maxprofit;

        
    }
}