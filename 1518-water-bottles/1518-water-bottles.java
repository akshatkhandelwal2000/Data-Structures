class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        // TC : O(1) // SC : O(1)
        int ans = numBottles;
        while(numBottles >= numExchange) {
            numBottles -= numExchange;
            numBottles++;
            ans++;
        }
        return ans;
    }
}