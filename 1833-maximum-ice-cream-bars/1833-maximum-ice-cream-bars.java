class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n = costs.length;
        int count = 0;

        Arrays.sort(costs);

        if (costs[0] > coins) {
            return 0;
        }

        for (int i = 0; i < n; i++) {
            if (costs[i] <= coins) {
                coins = coins - costs[i];
                count++;
            }
        }

        return count;
    }
}