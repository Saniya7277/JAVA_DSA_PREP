class Solution {
    public String reverseWords(String s) {

        String res = "";
        String ans = "";

        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            if (ch != ' ') {
                res = ch + res;
            } else {
                if (!res.isEmpty()) {
                    ans += res + " ";
                    res = "";
                }
            }
        }

        // Add the first word (which never gets added inside the loop)
        if (!res.isEmpty()) {
            ans += res;
        }

        return ans.trim();
    }
}
