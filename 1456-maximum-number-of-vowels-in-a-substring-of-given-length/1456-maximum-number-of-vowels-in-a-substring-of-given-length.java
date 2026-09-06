class Solution {
    public int maxVowels(String s, int k) {

        int count = 0;
        int max = 0;

        // First window
        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }

        max = count;

        // Move window one character at a time
        for (int i = k; i < s.length(); i++) {

            // Remove old character
            char old = s.charAt(i - k);

            if (old == 'a' || old == 'e' || old == 'i' ||
                old == 'o' || old == 'u') {
                count--;
            }

            // Add new character
            char current = s.charAt(i);

            if (current == 'a' || current == 'e' || current == 'i' ||
                current == 'o' || current == 'u') {
                count++;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}