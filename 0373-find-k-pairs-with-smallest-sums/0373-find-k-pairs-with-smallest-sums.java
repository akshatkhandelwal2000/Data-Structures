class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        // TC : O(K*log(nums1)) // SC : O(nums1 + k)
        List<List<Integer>> ans = new ArrayList<>();
        // create a pair pq of min heap and sort them based smallest sum of nums1 + nums2 
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        // in pq add all the elemets of nums1 by adding them with nums1[allelements] + nums2[0]
        for(int num : nums1) {
            pq.add(new int[]{num+nums2[0], 0});
        }
        // run while loop unitl k becomes 0 or pq becomes empty
        while(k > 0 && !pq.isEmpty()) {
            // poll out the pair
            int[] pair = pq.poll();
            // sum of num+nums2[0] that is nums1[i] + nums2[0]
            int sum = pair[0];
            // position of nums2[i]
            int pos = pair[1];
            List<Integer> cur = new ArrayList<>();
            cur.add(sum-nums2[pos]);
            cur.add(nums2[pos]);
            ans.add(cur);
            // if pos2.length is greater than pos+1
            if(pos+1 < nums2.length) {
            // if above condition is true and still k pairs are not found check if sum-nums2[pos] + nums2[pos+1] that is nums1[i] + nums2[pos+1] sum is smaller than any of the already present pair sum then it will be stored on top as it is a min heap and that will be one of our k pair 
                pq.add(new int[]{sum-nums2[pos]+nums2[pos+1], pos+1});
            }
            // decrement k
            k--;
        }
        return ans;
    }
}