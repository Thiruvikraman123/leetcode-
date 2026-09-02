class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        char[] ch = s.toCharArray();

        // Count frequency
        for (int i = 0; i < ch.length; i++) {
            map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
        }

        // Store characters
        ArrayList<Character> list = new ArrayList<>(map.keySet());

        // Sort by frequency (descending)
        list.sort((a, b) -> map.get(b) - map.get(a));

        StringBuilder sb = new StringBuilder();

        // Add character according to its frequency
        for (char c : list) {
            for (int i = 0; i < map.get(c); i++) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}