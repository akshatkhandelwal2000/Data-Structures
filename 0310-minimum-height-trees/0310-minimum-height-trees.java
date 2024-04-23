class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        // TC : O(V+E) // SC : O(V+E)
        List<List<Integer>> adj = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(n == 1) {
            list.add(0);
            return list;
        }
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        int m = edges.length;
        for(int i = 0; i < m; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        int[] indegree = new int[n];
        for(int i = 0; i < n; i++) {
            for(int it : adj.get(i)) {
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            if(indegree[i] == 1) {
                q.offer(i);
            }
        }
        int v = n;
        while(v > 2) {
            int size = q.size();
            v -= size;
            for(int i = 0; i < size; i++) {
                int node = q.peek();
                q.poll();
                for(int it : adj.get(node)) {
                    indegree[it]--;
                    if(indegree[it] == 1) {
                        q.offer(it);
                    }
                }
            }
        }
        while(!q.isEmpty()) {
            list.add(q.poll());
        }
        return list;
    }
}