class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // TC : O(V+2E) // SC : O(V+2E) + O(N) + O(N)
        if(n == 1) return true; 
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        int[] vis = new int[n];
        vis[source] = 1; 
        while(!q.isEmpty()) {
            int node = q.poll();
            for(int it : adj.get(node)) {
                if(it == destination) return true; 
                if(vis[it] == 0) {
                    vis[it] = 1;
                    q.add(it);
                }
            }
        }
        return false;
    }
}