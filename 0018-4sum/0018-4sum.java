class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // TC : O(N^2*N) N for while loop(k and l combined) so, - O(N^3) // SC : O(No. of quadruplets) that is also we are using just to store our answer so we can say that sc is constant i.e. O(1) 
        List<List<Integer>> ans = new ArrayList<>();
        if(nums.length < 4) return ans;
        Arrays.sort(nums);
        int n = nums.length;
        // calculate the quadruplets
        for(int i = 0; i < n; i++) {
            // avoid the duplicates while moving i
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j < n; j++) {
                // avoid the duplicates while moving j
                if(j != i+1 && nums[j] == nums[j-1]) continue;
                // 2 pointers
                int k = j+1;
                int l = n-1;
                while(k < l) {
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if(sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        // skip the duplicates
                        while(k < l && nums[k] == nums[k-1]) k++;;
                        while(k < l && nums[l] == nums[l+1]) l--;
                    }
                    else if(sum < target) k++;
                    else l--;
                }
            }
        }
        return ans;
    }
}