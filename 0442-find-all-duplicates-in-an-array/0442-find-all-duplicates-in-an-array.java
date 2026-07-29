class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int num:nums)
        {
            if(map.get(num)>1)
            {
                list.add(num);
                map.put(num,0);
            }
        }
        return list;
        
    }
}