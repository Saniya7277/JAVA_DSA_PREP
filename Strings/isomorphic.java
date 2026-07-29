import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        // If lengths are different, they cannot be isomorphic
        if (s.length() != t.length()) {
            return false;
        }

        // Map from s -> t
        HashMap<Character, Character> mapST = new HashMap<>();

        // Map from t -> s
        HashMap<Character, Character> mapTS = new HashMap<>();

        // Traverse both strings
        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            // Check mapping from s -> t
            if (mapST.containsKey(ch1)) {
                if (mapST.get(ch1) != ch2) {
                    return false;
                }
            } else {
                mapST.put(ch1, ch2);
            }

            // Check mapping from t -> s
            if (mapTS.containsKey(ch2)) {
                if (mapTS.get(ch2) != ch1) {
                    return false;
                }
            } else {
                mapTS.put(ch2, ch1);
            }
        }

        return true;
    }
}
