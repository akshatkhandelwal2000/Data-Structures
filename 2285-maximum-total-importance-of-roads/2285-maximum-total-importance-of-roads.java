class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int m = roads.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1]-a[1]);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < m; i++) {
            map.put(roads[i][0], map.getOrDefault(roads[i][0], 0)+1);
            map.put(roads[i][1], map.getOrDefault(roads[i][1], 0)+1);
        }
        for(int i : map.keySet()) {
            pq.offer(new int[]{i, map.get(i)});
        }
        int[] wt = new int[n];
        int k = n;
        while(!pq.isEmpty()) {
            int node = pq.peek()[0];
            pq.poll();
            wt[node] = k;
            k--;
        }
        long ans = 0;
        for(int j = 0; j < m; j++) {
            ans += wt[roads[j][1]];
            ans += wt[roads[j][0]];
        }
        return ans;
    }
}