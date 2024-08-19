class Solution {
    public int distinctPrimeFactors(int[] nums) {
        int n = nums.length;
        long pro = 1;
        for(int i = 0; i < n; i++) {
            pro *= nums[i];
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            for(int j = 2; j <= nums[i]; j++) {
                if(!set.contains(j)) {
                    if(isPrime(j)) {
                        set.add(j);
                    }
                }
            }
        }
        int ans = 0;
        for(int i : set) {
            int val = (int)pro/i;
            if(val*i == (int)pro) ans++;
        }
        return ans++;
    }
    public boolean isPrime(int j) {
        for(int i = 2; i < j; i++) {
            if(j%i == 0) return false;
        }
        return true;
    }
}