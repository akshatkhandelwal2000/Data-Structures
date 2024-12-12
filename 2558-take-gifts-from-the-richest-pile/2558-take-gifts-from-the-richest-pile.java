class Solution {
    public long pickGifts(int[] gifts, int k) {
        // TC : O(N) // SC : O(N)
        int n = gifts.length;
        long ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++) {
            pq.offer(gifts[i]);
        }
        while(k-- > 0) {
            pq.offer((int)Math.floor(Math.sqrt(pq.poll())));
        }
        while(!pq.isEmpty()) {
            ans += pq.poll();
        }
        return ans;
    }
}