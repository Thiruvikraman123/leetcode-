class Solution {
    public int rob(int[] nums) {
       // if(n==0) return 0;
       int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);

        int case1=robber(nums,0,n-2);

        int case2=robber(nums,1,n-1);

        return Math.max(case1,case2);
        
    }
    private int robber(int nums[],int start,int end)
    {
        int len=end-start+1;
        int[] dp=new int[len+1];

        dp[0]=0;
        dp[1]=nums[start];

        for(int i=2;i<=len;i++)
        {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[start+i-1]);
        }
        return dp[len];
    }
}