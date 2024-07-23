class Solution {
    class Pair {
        int val;
        int freq;
        public Pair(int val, int freq) {
            this.val = val;
            this.freq = freq;
        }
    }
    public int[] frequencySort(int[] nums) {
        // TC : O(NlogN) // SC : O(N + N) 
        int n = nums.length;
        int[] ans = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            if(a.freq == b.freq) {
                return b.val-a.val;
            }
            else {
                return a.freq-b.freq;
            }
        });
        for(int i : map.keySet()) {
            pq.offer(new Pair(i, map.get(i)));
        }
        int index = 0;
        while(!pq.isEmpty()) {
            int val = pq.peek().val;
            int freq = pq.peek().freq;
            pq.poll();
            for(int i = 0; i < freq; i++) {
                ans[index++] = val;
            }
        }
        return ans;
    }
}