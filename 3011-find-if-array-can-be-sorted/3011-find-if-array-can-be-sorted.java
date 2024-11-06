class Solution {
    public boolean canSortArray(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n-1; j++) {
                if(count(nums[j]) == count(nums[j+1]) && nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < n-1; i++) {
            if(nums[i] > nums[i+1]) {
                return false;
            }
        }
        return true;
    }
    public int count(int num) {
        int ans = 0;
        while(num != 0) {
            ans++;
            num = num & num-1;
        }
        return ans;
    }
}