class Solution {
    public boolean isAnagram(String s, String t) {

      if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Store frequency of characters from s
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                int c = map.get(ch);
                map.put(ch, c + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Reduce frequency using characters from t
        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            if (!map.containsKey(ch)) {
                return false;
            }

            int c = map.get(ch);

            if (c == 1) {
                map.remove(ch);
            } else {
                map.put(ch, c - 1);
            }
        }

        return map.isEmpty();
        
    }
}
