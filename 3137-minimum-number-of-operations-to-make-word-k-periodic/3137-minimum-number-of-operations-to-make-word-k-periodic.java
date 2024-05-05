class Solution {
    public int minimumOperationsToMakeKPeriodic(String word, int k) {
        // TC : O(K * K) // SC : O(N)
        int n = word.length();
        String s = "";
        int cnt = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i += k) {
            String str = word.substring(i, i+k);
            map.put(str, map.getOrDefault(str, 0)+1);
            if(cnt < map.get(str)) {
                cnt = map.get(str);
                s = str;
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i += k) {
            String str = word.substring(i, i+k);
            if(!str.equals(s)) ans++;
        }
        return ans;
    }
}
