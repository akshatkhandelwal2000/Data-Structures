class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        // TC : O(N*N) // SC : O(1)
        int n = hand.length;
        if(n % groupSize != 0) return false;
        Arrays.sort(hand);
        for(int i = 0; i < n; i++) {
            if(hand[i] >= 0) {
                int k = 0;
                int han = hand[i];
                int j = i;
                while(j < n && k < groupSize) {
                    if(hand[j] == han) {
                        han = hand[j]+1;
                        hand[j] = -1;
                        k++;
                    }
                    j++;
                }
                if(k != groupSize) return false;
            }
        }
        return true;
    }
}