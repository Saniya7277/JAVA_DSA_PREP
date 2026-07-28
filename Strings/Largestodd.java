class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            char ch = num.charAt(i);

            // Convert the character digit to an integer
            int digit = ch - '0';

            // Check if the digit is odd
            if (digit % 2 != 0) {

                // Return the substring from index 0 to i (inclusive)
                return num.substring(0, i + 1);
            }
        }

        // If no odd digit is found, return an empty string
        return "";
            
        }
        
    }
