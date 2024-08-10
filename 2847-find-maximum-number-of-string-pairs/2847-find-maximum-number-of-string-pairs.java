class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int n = words.length;
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(words[i], i);
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            String rev = sb.reverse().toString();
            if(map.containsKey(rev) && map.get(rev) > i) {
                ans++;
            }
        }
        return ans;
    }
}