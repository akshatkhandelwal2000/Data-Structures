class Solution {
    public long countOfSubstrings(String word, int k) {
        long score = solve(word, k);
        long sc = solve(word, k+1);
        return score-sc;
    }
    public long solve(String word, int k) {
        int n = word.length();
        int i = 0;
        int j = 0;
        int count = 0;
        int co = 0;
        long score = 0;
        Map<Character, Integer> map = new HashMap<>();
        while(j < n) {
            if(isVowel(word.charAt(j))) {
                map.put(word.charAt(j), map.getOrDefault(word.charAt(j), 0)+1);
            }
            else {
                co++;
            }
            while(co >= k && map.size() == 5) {
                score += n-j;
                if(map.containsKey(word.charAt(i))) {
                    map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0)-1);
                    if(map.get(word.charAt(i)) <= 0) {
                        map.remove(word.charAt(i));
                    }
                }
                else {
                    co--;
                }
                i++;
            }
            j++;
        }
        return score;
    }
    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}