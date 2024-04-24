class Pair{
    int first,second;
    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        // TC : O(ElogV) + O(V) // SC : O(E+V)
        List<List<Pair>> adj = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<>());
        }
        int m = times.length;
        for(int i = 0; i < m; i++){
            adj.get(times[i][0]).add(new Pair(times[i][1],times[i][2]));
        }
        int[] time = new int[n+1];
        for(int i = 0; i <= n; i++){
            time[i] = (int)1e9;
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y)-> x.first - y.first);
        time[k] = 0;
        pq.offer(new Pair(0,k));
        while(!pq.isEmpty()){
            int tym = pq.peek().first;
            int node = pq.peek().second;
            pq.poll();
            for(Pair it: adj.get(node)){
                int adjNode = it.first;
                int edgeWt = it.second;
                if(tym + edgeWt < time[adjNode]){
                    time[adjNode] = tym + edgeWt;
                    pq.offer(new Pair(time[adjNode],adjNode));
                }
            }
        }
        int ans = time[1];
        for(int i = 1; i <= n; i++){
            if(time[i] == 1e9) return -1;
            else ans = Math.max(ans,time[i]);
        }
        return ans;
    }
}