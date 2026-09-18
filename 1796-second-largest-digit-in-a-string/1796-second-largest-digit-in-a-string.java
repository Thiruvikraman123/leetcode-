class Solution {
    public int secondHighest(String s) {
        int[] arr=new int[s.length()];
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                arr[j]=s.charAt(i)-'0';
                j++;
            }
        }
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        int second=Integer.MIN_VALUE;
        boolean found=false;
        for(int i=0;i<j;i++)
        {
            if(arr[i]!=largest && arr[i]>second)
            {
                found=true;
                second=arr[i];
            }
        }
        return found ? second : -1;
        
    }
}