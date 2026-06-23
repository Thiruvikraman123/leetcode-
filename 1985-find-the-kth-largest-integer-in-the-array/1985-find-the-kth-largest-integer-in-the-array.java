import java.util.*;

class Solution {
    public String kthLargestNumber(String[] nums, int k) {

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        Collections.sort(list, (a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            }
            return a.compareTo(b);
        });

        return list.get(list.size() - k);
    }
}