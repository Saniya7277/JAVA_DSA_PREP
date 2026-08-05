class Solution {
    public int beautySum(String s) {
        int totalBeauty = 0;

        
        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {

                String sub = s.substring(i, j);

                int[] freq = new int[26];

                // Count frequency of characters
                for (int k = 0; k < sub.length(); k++) {
                    char ch = sub.charAt(k);
                    freq[ch - 'a']++;
                }

                int max = 0;
                int min = Integer.MAX_VALUE;

                // Find maximum and minimum non-zero frequency
                for (int k = 0; k < 26; k++) {

                    if (freq[k] > max) {
                        max = freq[k];
                    }

                    if (freq[k] != 0 && freq[k] < min) {
                        min = freq[k];
                    }
                }

                totalBeauty += (max - min);
            }
        }

        return totalBeauty;
    }

}
