class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        // TC : O(N) // SC : O(1)
        int n = chalk.length;
        long sum = 0;
        for(int i = 0; i < n; i++) {
            sum += chalk[i];
        }
        while(k >= sum) {
            k -= sum;
        }
        for(int i = 0; i < n; i++) {
            if(chalk[i] > k) return i;
            else k -= chalk[i];
        }
        return 0;
    }
}