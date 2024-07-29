class Solution {
    public int numTeams(int[] rating) {
        // TC : O(N*N*N) // SC : O(1)
        int n = rating.length;
        int ans = 0;
        for(int i = 0; i < n-2; i++) {
            for(int j = i+1; j < n-1; j++) {
                for(int k = j+1; k < n; k++) {
                    if(rating[i] < rating[j] && rating[j] < rating[k]) {
                        ans++;
                    }
                    else if(rating[i] > rating[j] && rating[j] > rating[k]) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}