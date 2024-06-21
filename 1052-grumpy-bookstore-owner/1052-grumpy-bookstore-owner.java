class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        // TC : O(N) + O(N) // SC : O(1)
        int n = customers.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if(grumpy[i] == 0) ans += customers[i];
            else grumpy[i] *= customers[i];
        }
        int i = 0;
        int j = 0;
        int sum = 0;
        int max = 0;
        while(j < n) {
            sum += grumpy[j];
            if(j-i+1 > minutes) {
                sum -= grumpy[i];
                i++;
            }
            if(j-i+1 == minutes) {
                max = Math.max(max, sum);
            }
            j++;
        }
        return ans+max;
    }
}