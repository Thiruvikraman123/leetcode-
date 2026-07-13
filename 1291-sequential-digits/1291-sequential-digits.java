class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s="123456789";
        List<Integer>list=new ArrayList<>();
        for(int len=2;len<=9;len++)
        {
            for(int i=0;i+len<=9;i++)
            {
                String num=s.substring(i,i+len);
                int value=Integer.parseInt(num);
                if(value>=low && value<=high)
                {
                    list.add(value);
                }

            }
        }
        return list;
        
    }
}