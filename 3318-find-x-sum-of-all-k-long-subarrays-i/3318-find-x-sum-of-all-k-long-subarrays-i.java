class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        // TC : O(N) // SC : O(N)
        int  n = nums.length;
        int[] ans = new int[n-k+1];
        for(int i = 0; i < n-k+1; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
                if(a[1] == b[1]) {
                    return b[0]-a[0];
                }
                else {
                    return b[1]-a[1];
                }
            });
            for(int j = i; j <= i+k-1; j++) {
                map.put(nums[j], map.getOrDefault(nums[j], 0)+1);
            }
            for(int a : map.keySet()) {
                pq.offer(new int[]{a, map.get(a)});
            }
            int b = x;
            int count = 0;
            while(b-- > 0 && !pq.isEmpty()) {
                for(int c = 0; c < pq.peek()[1]; c++) {
                    count += pq.peek()[0];
                }
                pq.poll();
            }
            ans[i] = count;
        }
        return ans;
    }
}