class Solution {
    public int longestPalindrome(String[] words) {
        // TC : O(N + 26) // SC : O(26)
        Map<String, Integer> map = new HashMap<>();
        for(String word : words) {
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        int ans = 0;
        int cnt = 0;
        for(String i : map.keySet()) {
            StringBuilder sb = new StringBuilder(i);
            sb.reverse();
            if(sb.toString().equals(i)) {
                int val = map.get(i);
                if(val % 2 != 0) {
                    val -= 1;
                    cnt = 1;
                }
                ans += 2*val;
                map.put(i, map.get(i)-val);
            }
            else if(map.containsKey(sb.toString())) {
                int min = Math.min(map.get(i), map.get(sb.toString()));
                ans += 4*min;
                map.put(i, map.get(i)-min);
                map.put(sb.toString(), map.get(sb.toString())-min);
            }
        }
        return cnt == 1 ? ans + 2 : ans;
    }
}