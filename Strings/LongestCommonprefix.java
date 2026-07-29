class Solution {
    public String longestCommonPrefix(String[] str) {

        // Take the first string as the reference
        String first = str[0];

        // This will store the common prefix
        String ans = "";

        // Traverse each character of the first string
        for (int i = 0; i < first.length(); i++) {

            // Compare this character with every other string
            for (int j = 1; j < str.length; j++) {

                // If current string is shorter
                // OR characters don't match
                if (i >= str[j].length() || first.charAt(i) != str[j].charAt(i)) {
                    return ans;
                }
            }

            // If all strings matched at this position,
            // add the character to the answer
            ans += first.charAt(i);
        }

        return ans;
    }
}
