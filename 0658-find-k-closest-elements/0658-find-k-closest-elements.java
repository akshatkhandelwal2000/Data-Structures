class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // TC : O(NlogN) // SC : O(N)
        int n = arr.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            if(a[0] == b[0]) {
                return a[1]-b[1];
            }
            else return a[0]-b[0];
        });
        for(int i = 0; i < n; i++) {
            pq.offer(new int[]{Math.abs(arr[i]-x), arr[i]});
        }
        List<Integer> ans = new ArrayList<>();
        while(k-- > 0) {
            ans.add(pq.poll()[1]);
        }
        Collections.sort(ans);
        return ans;
    }
}