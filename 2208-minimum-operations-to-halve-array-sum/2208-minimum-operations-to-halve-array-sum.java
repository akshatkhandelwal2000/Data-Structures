class Solution {
    public int halveArray(int[] nums) {
        // TC : O(NlogN) // SC : O(N)
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        double sum = 0;
        for(int i : nums) {
            pq.offer((double)i);
            sum += i;
        }
        sum = sum/2.0;
        double sum2 = 0.0;
        int ans = 0;
        while(sum2 < sum) {
            double i = pq.poll();
            pq.offer(i/2.0);
            sum2 += i/2.0;
            ans++;
        }
        return ans;
    }
}