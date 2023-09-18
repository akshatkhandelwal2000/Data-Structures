class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // TC : O(NlogK) // SC : O(N+K)
        if(nums.length == k) return nums;
        Map<Integer, Integer> map = new HashMap<>();
        for(int val : nums) {
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
        for(int num : map.keySet()) {
            pq.add(num);
            if(pq.size() > k) {
                pq.poll();
            }
        }
        int[] ans = new int[k];
        // for(int i = k-1; i >= 0; i--) {
        //     ans[i] = pq.poll();
        // }
        while(!pq.isEmpty()) {
            ans[--k] = pq.poll();
        }
        return ans;   
    }
}