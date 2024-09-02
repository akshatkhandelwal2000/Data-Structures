class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        // TC : O(N) // SC : O(1)
        int n = chalk.length;
        int i = 0;
        while(k >= chalk[i]) {
            k -= chalk[i];
            if(i == n-1) i = 0;
            else i++;
        }
        return i;
    }
}