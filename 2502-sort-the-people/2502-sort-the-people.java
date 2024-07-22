class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        // TC : O(NlogN) // SC : O(N)
        int n = names.length;
        TreeMap<Integer, String> map = new TreeMap<>();
        String[] ans = new String[n];
        for(int i = 0; i < n; i++) {
            map.put(heights[i], names[i]);
        }
        int i = n-1;
        for(String s : map.values()) {
            ans[i--] = s;
        }
        return ans;
    }
}