class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        // TC : O(NlogK) // SC : O(K) 
        int n = reward2.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans += reward2[i];
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < reward1.length; i++) {
            pq.offer(reward1[i] - reward2[i]);
            if(pq.size() > k) pq.poll();
        }
        while(!pq.isEmpty()) {
            ans += pq.poll();
        }
        return ans;
    }
}