class Solution {
    public int countSymmetricIntegers(int low, int high) {
        // TC : O(high-low+1*lengthOfStr/2) // SC : O(1)
        int ans = 0;
         for(int i = low; i <= high; i++) {
            String str = String.valueOf(i);
            if(str.length()%2 != 0) {
                continue;
            }
            int lSum = 0;
            int rSum = 0;
            for(int j = 0; j < str.length()/2; j++) {
                lSum += Integer.valueOf(str.charAt(j));
                rSum += Integer.valueOf(str.charAt(str.length()-j-1));
            }
            if(lSum == rSum) {
                ans++;
            }
         }
         return ans;
    }
}