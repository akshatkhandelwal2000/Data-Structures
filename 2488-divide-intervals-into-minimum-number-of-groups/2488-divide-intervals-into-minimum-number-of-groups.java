class Solution {
    public int minGroups(int[][] intervals) {
        // TC : O(NlogN) // SC : O(N)
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if(!pq.isEmpty() && intervals[i][0] <= pq.peek()) {
                pq.offer(intervals[i][1]);
            }
            else if(!pq.isEmpty() && intervals[i][0] > pq.peek()) {
                pq.poll();
                pq.offer(intervals[i][1]);
            }
            else {
                pq.offer(intervals[i][1]);
            }
        }
        return pq.size();
    }
}