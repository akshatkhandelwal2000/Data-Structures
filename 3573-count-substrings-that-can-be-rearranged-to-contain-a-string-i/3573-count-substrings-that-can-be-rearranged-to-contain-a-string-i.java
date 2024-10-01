class Solution {
    public long validSubstringCount(String word1, String word2) {
        int n = word1.length();
        long score = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < word2.length(); i++) {
            map.put(word2.charAt(i), map.getOrDefault(word2.charAt(i), 0)+1);
        }
        int i = 0;
        int j = 0;
        int k = word2.length();
        int count = 0;
        Map<Character, Integer> premap = new HashMap<>();
        while(j < n) {
            premap.put(word1.charAt(j), premap.getOrDefault(word1.charAt(j), 0)+1);
            if(map.containsKey(word1.charAt(j)) && premap.get(word1.charAt(j)) <= map.get(word1.charAt(j))) {
                    count++;
            }
            while(count == k) {
                score += n-j;
                premap.put(word1.charAt(i), premap.getOrDefault(word1.charAt(i), 0)-1);
                if(map.containsKey(word1.charAt(i)) && premap.get(word1.charAt(i)) < map.get(word1.charAt(i))) {
                    count--;
                }
                i++;
            }
            j++;
        }
        return score;
    }
}