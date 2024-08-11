class Solution {
    public int countGoodNodes(int[][] edges) {
        // TC : O(N) // SC : O(N)
        int n = edges.length;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n+1; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < n; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int[] ans = new int[1];
        dfs(adj, 0, -1, ans);
        return ans[0];
    }
    public int dfs(List<List<Integer>> adj, int node, int parent, int[] ans) {
        int total = 0;
        boolean isGood = true;
        int subtreesize = -1;
        for(int nei : adj.get(node)) {
            if(nei == parent) continue;
            int cursize = dfs(adj, nei, node, ans);
            if(subtreesize == -1) {
                subtreesize = cursize;
            }
            else if(cursize != subtreesize) {
                isGood = false;
            }
            total += cursize;
        }
        if(isGood) ans[0]++;
        return total+1;
    }
}