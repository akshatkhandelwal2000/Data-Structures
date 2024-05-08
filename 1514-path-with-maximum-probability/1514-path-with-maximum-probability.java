class Solution {
    class Pair {
        int first;
        double second;
        public Pair(int first, double second) {
            this.first = first;
            this.second = second;
        }
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        // TC : O(E log V) // SC : O(N) 
        List<List<Pair>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            List<Pair> list = new ArrayList<>();
            adj.add(list);
        }
        int m = edges.length;
        for(int i = 0; i < m; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            double wt = succProb[i];
            adj.get(u).add(new Pair(v, wt));
            adj.get(v).add(new Pair(u, wt));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y) -> Double.compare(y.second, x.second));
        double[] dist = new double[n];
        for(int i = 0; i < n; i++) {
            dist[i] = -1.0;
        }
        dist[start_node] = 0.0;
        pq.offer(new Pair(start_node, 1.0));
        while(!pq.isEmpty()) {
            int node = pq.peek().first;
            double dis = pq.peek().second;
            pq.poll();
            for(Pair it : adj.get(node)) {
                int adjnode = it.first;
                double wt = it.second;
                if(dis * wt > dist[adjnode]) {
                    dist[adjnode] = dis * wt;
                    pq.offer(new Pair(adjnode, dist[adjnode]));
                }
            }
        }
        if(dist[end_node] == -1.0) return 0.0;
        return dist[end_node];
    }
}