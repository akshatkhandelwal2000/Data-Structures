class Pair{
    int val;
    int freq;
    public Pair(int val, int freq) {
        this.val = val;
        this.freq = freq;
    }
}
class Solution {
    public int[] frequencySort(int[] nums) {
        // TC : O(NlogN) // SC : O(N + N)
        Map<Integer, Integer> map = new HashMap<>();
        for(int val : nums) {
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            if(a.freq == b.freq) {
                return b.val - a.val;
            }
            else {
                return a.freq - b.freq;
            }
        });
        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
            pq.add(new Pair(e.getKey(), e.getValue()));
        }
        int[] ans = new int[nums.length];
        int k = 0;
        while(!pq.isEmpty()) {
            int va = pq.peek().val;
            int fre = pq.peek().freq;
            for(int i = 0; i < fre; i++) {
                ans[k++] = va;
            }
            pq.poll();
        }
        return ans; 
    }
}