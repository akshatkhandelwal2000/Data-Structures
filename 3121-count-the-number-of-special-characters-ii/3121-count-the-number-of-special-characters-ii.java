class Solution {
    public int numberOfSpecialChars(String word) {
        // TC : O(N) // SC : O(1)
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < word.length(); i++) {
            if(map.containsKey(word.charAt(i)) && Character.isUpperCase(word.charAt(i))) {
                continue;
            }
            else {
                map.put(word.charAt(i), i);
            }
        }
        int[] freq = new int[128];
        for(int i = 0; i < word.length(); i++) {
            freq[word.charAt(i)]++;
        }
        int ans = 0;
        for(int i = 0; i < word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))) {
                freq[word.charAt(i)] = 0;
            }
            if(Character.isLowerCase(word.charAt(i)) && map.containsKey(word.charAt(i)) && map.containsKey(Character.toUpperCase(word.charAt(i))) && 
            map.get(word.charAt(i)) > map.get(Character.toUpperCase(word.charAt(i)))) {
                freq[word.charAt(i)] = 0;
            }
            int asci = word.charAt(i);
            if(freq[asci] >= 1 && freq[asci-32] >= 1) {
                ans++;
                freq[asci] = 0;
                freq[asci-32] = 0;
            }
        }
        return ans;
    }
}