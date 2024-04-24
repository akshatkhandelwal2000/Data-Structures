class Solution {
    class Pair {
        long first;
        long second;
        public Pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }
    public int countPaths(int n, int[][] roads) {
        // TC : O(ElogV) + O(V) + O(E) // SC : O(V+E) + O(V) + O(V)
        List<List<Pair>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        int m = roads.length;
        for(int i = 0; i < m; i++) {
            adj.get(roads[i][0]).add(new Pair(roads[i][1], roads[i][2]));
            adj.get(roads[i][1]).add(new Pair(roads[i][0], roads[i][2]));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingLong(x -> x.first));
        long[] dist = new long[n];
        int[] ways = new int[n];
        for(int i = 0; i < n; i++) {
            dist[i] = Long.MAX_VALUE;
        }
        dist[0] = 0;
        ways[0] = 1;
        int mod = (int)(1e9+7);
        pq.offer(new Pair(0, 0));
        while(!pq.isEmpty()) {
            long dis = pq.peek().first;
            long node = pq.peek().second;
            pq.poll();            
            for(Pair it : adj.get((int)node)) {
                long adjnode = it.first;
                long ewt = it.second;
                if(dis+ewt < dist[(int)adjnode]) {
                    dist[(int)adjnode] = dis+ewt;
                    pq.offer(new Pair(dist[(int)adjnode], adjnode));
                    ways[(int)adjnode] = ways[(int)node];
                }
                else if(dis+ewt == dist[(int)adjnode]) {
                    ways[(int)adjnode] = (ways[(int)adjnode] + ways[(int)node]) % mod;
                }
            }
        }
        return ways[n-1];
    }
}