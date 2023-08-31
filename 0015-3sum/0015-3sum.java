class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // TC : O(N^2) N for loop and another N for j and k combined // SC : O(No. of triplets) that is also we are using just to store our answer so we can say that sc is constant i.e. O(1) 
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        // calculate the triplets
        for(int i = 0; i < n; i++) {
            // avoid the duplicates while moving i
            if(i > 0 && nums[i] == nums[i-1]) continue;
            // 2 pointers
            int j = i+1;
            int k = n-1;
            while(j < k) {
            int sum = nums[i];
            sum += nums[j] + nums[k];
            if(sum == 0) {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(nums[j]);
                temp.add(nums[k]);
                ans.add(temp);
                j++;
                k--;
                // skip the duplicates for j and k
                while(j < k && nums[j] == nums[j-1]) j++;
                while(j < k && nums[k] == nums[k+1]) k--;
            }
            else if(sum < 0) j++;
            else k--;
            }
        }
        return ans;
    }
}