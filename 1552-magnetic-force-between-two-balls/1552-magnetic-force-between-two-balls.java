class Solution {
    public int maxDistance(int[] position, int m) {
        // TC : O(NlogN) + O(log(max)*N) // SC : O(1)
        int n = position.length;
        Arrays.sort(position);
        int min = 1;
        int max = position[n-1]-position[0];
        int ans = 0;
        while(min <= max) {
            int mid = (min+max)/2;
            if(possible(mid, position, m)) {
                ans = mid;
                min = mid+1;
            }
            else {
                max = mid-1;
            }
        }
        return ans;
    }
    public boolean possible(int force, int[] position, int m) {
        int n = position.length;
        int balls = 1;
        int prev = position[0];
        for(int i = 1; i < n; i++) {
            int cur = position[i];
            if(cur-prev >= force) {
                balls++;
                prev = cur;
            }
            if(balls == m) break;
        }
        return balls == m;
    }
}