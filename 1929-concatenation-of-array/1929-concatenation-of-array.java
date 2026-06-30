class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int t=n+n;
        int[] arr=new int[t];
        for(int i=0;i<n;i++)
        {
            arr[i]=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            arr[n+i]=nums[i];
        }
        return arr;


        
    }
}