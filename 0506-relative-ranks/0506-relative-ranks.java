class Solution {
    public String[] findRelativeRanks(int[] score) {
        // TC : O(NlogN) // SC : O(N)
        int n = score.length;
        String[] ans = new String[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        for(int i = 0; i < n; i++) {
            pq.offer(new int[]{score[i], i});
        }
        int in = n;
        while(pq.size() > 3) {
            ans[pq.peek()[1]] = Integer.toString(in);
            in = in - 1;
            pq.poll();
        }
        int size = pq.size();
        while(!pq.isEmpty()) {
            if(size == 3) {
                ans[pq.peek()[1]] = "Bronze Medal";
            }
            if(size == 2) {
                ans[pq.peek()[1]] = "Silver Medal";
            }
            if(size == 1) {
                ans[pq.peek()[1]] = "Gold Medal";
            }
            pq.poll();
            size--;
        }
        return ans; 
    }
}