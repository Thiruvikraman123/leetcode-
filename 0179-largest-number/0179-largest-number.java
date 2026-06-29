class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String[] arr=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=String.valueOf(nums[i]);
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((arr[j]+arr[i]).compareTo(arr[i]+arr[j])>0)
                {
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            sb.append(arr[i]);
        }
        if(sb.charAt(0)=='0') return "0";
        return sb.toString();
        
    }
}