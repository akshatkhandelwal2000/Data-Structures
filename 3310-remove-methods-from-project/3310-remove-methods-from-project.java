class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        // TC : O(V+E) // SC : O(V+E) + O(N)
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < invocations.length; i++) {
            int u = invocations[i][0];
            int v = invocations[i][1];
            adj.get(u).add(v);
        }
        boolean[] vis = new boolean[n];
        dfs(k, adj, vis);
        boolean flag = true;
        for(int i = 0; i < n; i++) {
            if(vis[i] == true) {
                continue;
            }
            for(int j : adj.get(i)) {
                if(vis[j] == true) {
                    flag = false;
                    break;
                }
            }                                                                 
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(vis[i] == false || flag == false) {
                ans.add(i);
            }
        }
        return ans;
    }
    public void dfs(int i, List<List<Integer>> adj, boolean[] vis) {
        vis[i] = true;
        for(int it : adj.get(i)) {
            if(vis[it] == false) {
                dfs(it, adj, vis);
            }
        }
    }
}