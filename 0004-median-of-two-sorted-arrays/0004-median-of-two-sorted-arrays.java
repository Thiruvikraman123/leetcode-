import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;

        // Merge both sorted arrays
        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] <= nums2[j]) {
                list.add(nums1[i]);
                i++;
            } else {
                list.add(nums2[j]);
                j++;
            }
        }

        // Add remaining elements of nums1
        while (i < nums1.length) {
            list.add(nums1[i]);
            i++;
        }

        // Add remaining elements of nums2
        while (j < nums2.length) {
            list.add(nums2[j]);
            j++;
        }

        int n = list.size();

        if (n % 2 == 1) {
            return list.get(n / 2);
        } else {
            return (list.get(n / 2 - 1) + list.get(n / 2)) / 2.0;
        }
    }
}