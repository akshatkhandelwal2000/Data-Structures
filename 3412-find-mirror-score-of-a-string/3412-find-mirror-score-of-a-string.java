class Solution {
    public long calculateScore(String s) {
        // TC : O(N) // SC : O(N)
        int n = s.length();
        long ans = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int a = s.charAt(i)-'a';
            int b = 25-a;
            if(map.containsKey(b) && map.get(b).size() > 0) {
                ans += (long)i-(long)map.get(b).get(map.get(b).size()-1);
                map.get(b).remove(map.get(b).size()-1);
            }
            else {
                if(!map.containsKey(a)) {
                    map.put(a, new ArrayList<>());
                    map.get(a).add(i);
                }
                else {
                    map.get(a).add(i);
                }
            }
        }
        return ans;
    }
}