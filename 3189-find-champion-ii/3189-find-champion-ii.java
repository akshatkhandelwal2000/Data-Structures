class Solution {
    public int findChampion(int n, int[][] edges) {
        // TC : O(N) // SC : O(N)
        int m = edges.length;
        if(m == 0 && n == 1) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        int max = 0;
        Set<Integer> b = new HashSet<>();
        for(int i = 0; i < m; i++) {
            set.add(edges[i][1]);
            b.add(edges[i][1]);
        }
        int ans = 0;
        int count = 0;
        Set<Integer> a = new HashSet<>();
        for(int i = 0; i < m; i++) {
            if(!set.contains(edges[i][0]) && !a.contains(edges[i][0])) {
                ans = edges[i][0];
                a.add(edges[i][0]);
                count++;
            }
            b.add(edges[i][0]);
        }
        if(count > 1 || b.size() != n) {
            return -1;
        }
        return ans;
    }
}