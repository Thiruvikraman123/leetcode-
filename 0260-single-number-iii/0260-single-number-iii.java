class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[] arr=new int[2];
        int index=0;
        for(int num:nums)
        {
            if(map.get(num)==1)
            {
                arr[index]=num;
                index++;
            }
        }
        return arr;
        
    }
}