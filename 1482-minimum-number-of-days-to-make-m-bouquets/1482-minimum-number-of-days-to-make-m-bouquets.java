class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        // TC : O(N) + O(NlogN) // SC : O(1)
        int n = bloomDay.length;
        if((long)m*k > n) return -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            min = Math.min(min, bloomDay[i]);
            max = Math.max(max, bloomDay[i]);
        }
        int lo = min;
        int hi = max;
        while(lo <= hi) {
            int mid = (lo+hi)/2;
            if(possible(bloomDay, mid, m, k)) {
                hi = mid-1;
            }
            else {
                lo = mid+1;
            }
        }
        return lo;
    }
    public boolean possible(int[] bloomDay, int day, int m, int k) {
        int n = bloomDay.length;
        int cnt = 0;
        int bouquets = 0;
        for(int i = 0; i < n; i++) {
            if(bloomDay[i] <= day) {
                cnt++;
            }
            else {
                bouquets += cnt/k;
                cnt = 0;
            }
        }
        bouquets += cnt/k;
        return bouquets >= m;
    }
}