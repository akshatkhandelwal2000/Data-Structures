class Solution {
    public int maximumLength(String s) {
        // TC : O(N) // SC : O(N)
        int n = s.length();
        int ans = -1;
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                String curr = s.substring(i, j+1);
                map.put(curr, map.getOrDefault(curr, 0)+1);
            }
        }
        for(String st : map.keySet()) {
            if(map.get(st) >= 3) {
                boolean flag = true;
                char ch = st.charAt(0);
                for(int i = 1; i < st.length(); i++) {
                    if(st.charAt(i) != ch) {
                        flag = false;
                        break;
                    }   
                }
                if(flag) {
                    ans = Math.max(ans, st.length());
                }   
            }
        }
        return ans;   
    }
}