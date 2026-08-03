class Solution {
    public String frequencySort(String s) {
         HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for(char ch : s.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }


        // Step 2: Store characters in a list
        List<Map.Entry<Character, Integer>> list =
                new ArrayList<>(map.entrySet());


        // Step 3: Sort by frequency descending
        list.sort((a, b) -> b.getValue() - a.getValue());


        // Step 4: Build answer
        StringBuilder result = new StringBuilder();


        for(Map.Entry<Character, Integer> entry : list) {

            char ch = entry.getKey();
            int frequency = entry.getValue();


            // Add character frequency times
            for(int i = 0; i < frequency; i++) {

                result.append(ch);

            }
        }


        return result.toString();
        
    }
}
