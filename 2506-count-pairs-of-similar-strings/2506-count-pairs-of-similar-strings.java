class Solution {
    public int similarPairs(String[] words) {
        // TC : O(N*N) // SC : O(1)
        int n = words.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            Map<Character, Integer> map = new HashMap<>();
            String word = words[i];
            for(int j = 0; j < word.length(); j++) {
                char c = word.charAt(j); 
                map.put(c, map.getOrDefault(c, 0)+1);
            }
            for(int k = i+1; k < n; k++) {
                boolean flag = true;
                Map<Character, Integer> map2 = new HashMap<>();
                String s = words[k];
                for(int l = 0; l < s.length(); l++) {
                    char c = s.charAt(l); 
                    map2.put(c, map2.getOrDefault(c, 0)+1);
                }
                if(map.size() != map2.size()) {
                    flag = false;
                    continue;
                }
                for(char v : map.keySet()) {
                    if(!map2.containsKey(v)) {
                        flag = false;
                        break;
                    }
                }
                if(flag) ans++;
            }
        } 
        return ans;
    }
}