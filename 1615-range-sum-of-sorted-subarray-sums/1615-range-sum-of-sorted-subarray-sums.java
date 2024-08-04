class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        // TC : O(N^2) + O(N^2logN) // SC : O(N^2)
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i; j < n; j++) {
                sum += nums[j];
                list.add(sum);
            }
        }
        Collections.sort(list);
        int ans = 0;
        int mod = 1000000007;
        for(int i = left-1; i < right; i++) {
            ans = (ans + list.get(i))%mod;
        }
        return ans%mod;
    }
}