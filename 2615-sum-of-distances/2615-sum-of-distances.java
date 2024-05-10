class Solution {
    public long[] distance(int[] nums) {
        // TC : O(N) // SC : O(N)
        int n = nums.length;
        long[] ans = new long[n];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            if(!map.containsKey(nums[i])) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            }
            else {
                map.get(nums[i]).add(i);
            }
        }
        for(List<Integer> list : map.values()) {
            int size = list.size();
            long sum = 0;
            for(int i = 0; i < size; i++) {
                sum += list.get(i);
            }
            long leftSum = 0;
            long rightSum = sum;
            for(int i = 0; i < size; i++) {
                long currSum = 0;
                currSum += (long)i*(long)list.get(i)-leftSum;
                currSum += rightSum-(long)(size-i)*(long)list.get(i);
                leftSum += (long)list.get(i);
                rightSum -= (long)list.get(i);
                ans[list.get(i)] = currSum; 
            }
        }
        return ans;
    }
}