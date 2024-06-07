class Solution {
    public int binaryGap(int n) {
        // TC : O(N) // SC : O(1)
        String num = Integer.toBinaryString(n);
        int ans = 0;
        int ind = -1;
        int max = 0;
        for(int i = 0; i < num.length(); i++) {
            if(num.charAt(i) == '1') {
                ind = i;
                i++;
            }
            while(i < num.length() && num.charAt(i) == '0') {
                i++;
            }
            if(i < num.length() && num.charAt(i) == '1') {
                max = i-ind;
                ans = Math.max(ans, max);
                ind = i;
            }
        }
        return ans;
    }
}