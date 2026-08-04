import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        int first = nums[0];
        int last = nums[n - 1];

        int size = last - first + 1;
        int[] arr = new int[size];

        // Create the expected array
        for (int i = 0; i < size; i++) {
            arr[i] = first + i;
        }

        List<Integer> ans = new ArrayList<>();

        int j = 0;

        // Compare expected array with original array
        for (int i = 0; i < size; i++) {

            if (j < n && arr[i] == nums[j]) {
                j++;
            } else {
                ans.add(arr[i]);
            }
        }

        return ans;
    }
}