class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        // TC : O(NlogN) // SC : O(N)
        int n = hand.length;
        if(n % groupSize != 0) return false;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(hand[i], map.getOrDefault(hand[i], 0)+1);
        }
        Arrays.sort(hand);
        for(int i = 0; i < n; i++) {
            if(map.get(hand[i]) == 0) continue;
            for(int j = 0; j < groupSize; j++) {
                int h = hand[i]+j;
                if(map.getOrDefault(h, 0) <= 0) return false;
                map.put(h, map.get(h)-1);
            }
        }
        return true;
    }
} 