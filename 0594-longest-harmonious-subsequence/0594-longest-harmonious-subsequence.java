class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            
        }
        ArrayList<Integer>list=new ArrayList<>(map.keySet());
        int max=0;
        Collections.sort(list);
        for (int i = 1; i < list.size(); i++) {

            if (list.get(i) - list.get(i - 1) == 1) {

                int length = map.get(list.get(i))
                           + map.get(list.get(i - 1));

                if (length > max) {
                    max = length;
                }
            }
        }

        return max;



         
        
    }
}