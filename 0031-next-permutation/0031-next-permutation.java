class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i;

        for(i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                break;
            }
        }
        if(i>=0)
        {
            int j;
            for(j=n-1;j>i;j--)
            {
                if(nums[j]>nums[i])
                {
                    break;
                }
            }
            int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        }
        

        int left=i+1;

        for(int right=n-1;left<right;left++,right--)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
        }
        
    }
}