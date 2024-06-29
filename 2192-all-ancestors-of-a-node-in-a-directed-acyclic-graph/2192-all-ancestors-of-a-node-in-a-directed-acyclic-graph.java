class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        // TC : O(N*NlogN+M) // SC : O(N*N+M);
        List<List<Integer>> ans = new ArrayList<>();
        int m = edges.length;
        for(int i = 0; i < n; i++) {
            ans.add(new ArrayList<>());
        }   
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[n];
        for(int i = 0; i < m; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            indegree[v]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            if(indegree[i] == 0) q.offer(i);
        }
        List<Integer> topo = new ArrayList<>();
        while(!q.isEmpty()) {
            int node = q.poll();
            topo.add(node);
            for(int it : adj.get(node)) {
                indegree[it]--;
                if(indegree[it] == 0) q.offer(it);
            }
        }
        List<Set<Integer>> set = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            set.add(new HashSet<>());
        } 
        for(int node : topo) {
            for(int it : adj.get(node)) {
                set.get(it).add(node);
                set.get(it).addAll(set.get(node));
            }
        }
        for(int i = 0; i < n; i++) {
            ans.get(i).addAll(set.get(i));
            Collections.sort(ans.get(i));
        }
        return ans;
    }
}