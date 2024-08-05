class Solution {
    public String kthDistinct(String[] arr, int k) {
        // TC : O(N) + O(N) // SC : O(N)
        Map<String, Integer> map = new HashMap<>();
        for(String s : arr) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        int ans = 0;
        for(String s : arr) {
            if(map.get(s) == 1) {
                ans++;
                if(ans == k) return s;
            }
        }
        return "";
    }
}