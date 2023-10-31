class Solution {
    public int lastStoneWeight(int[] stones) {
        // TC : O(NlogN) adding in heap takes log N time for N elements it will take NlogN time 
        // SC : O(N)
        if(stones.length == 1) return stones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        for(int stone : stones) {
            pq.add(stone);
        }
        while(pq.size() > 1) {
            int y = pq.poll();
            int x = pq.poll();
            if(x == y) continue;
            else if(x != y) pq.add(y-x);
        }
        return pq.size() > 0 ? pq.poll() : 0;
    }
}