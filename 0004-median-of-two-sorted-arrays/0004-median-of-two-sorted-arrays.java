class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer>list=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<=nums2[j])
            {
                list.add(nums1[i]);
                i++;
            }
            else if(nums2[j] <= nums1[i])
            {
                list.add(nums2[j]);
                j++;
            }
        }    
        while(i<nums1.length)
        {
            list.add(nums1[i]);
            i++;
        }
        while(j<nums2.length)
        {
            list.add(nums2[j]);
            j++;
        }

        int n=list.size();

        if(n%2 == 1)
        {
            return list.get(n/2);
        }
        else{
            return (list.get(n/2-1)+list.get(n/2))/2.0;
        }
        
        
    }
}