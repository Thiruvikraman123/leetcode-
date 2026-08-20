class Solution {
    public int[] resultArray(int[] nums) {

        int n = nums.length;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        arr1[0] = nums[0];
        arr2[0] = nums[1];

        int x = 1;
        int y = 1;

        for (int i = 2; i < n; i++) {

            if (arr1[x - 1] > arr2[y - 1]) {
                arr1[x] = nums[i];
                x++;
            }
            else {
                arr2[y] = nums[i];
                y++;
            }
        }

        int[] result = new int[n];

        for (int i = 0; i < x; i++) {
            result[i] = arr1[i];
        }

        for (int i = 0; i < y; i++) {
            result[x + i] = arr2[i];
        }

        return result;
    }
}