class Solution {
    public int[] searchRange(int[] nums, int target) {
        // int[] ans = new int[2];
        // ans[0] = -1;
        // ans[1] = -1;
        // for(int i = 0; i < nums.length; i++) {
        //     if(nums[i] == target) {
        //         ans[0] = i;
        //         break;
        //     }
        // }
        // for(int i = nums.length-1; i >= 0; i--) {
        //     if(nums[i] == target) {
        //         ans[1] = i;
        //         break;
        //     }
        // } 
        // return ans;
        int first = findPos(nums, true, target);
        int second = findPos(nums, false, target);
        return new int[]{first, second};
    }
    public int findPos(int[] nums, boolean flag, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] == target) {
                index = mid;
                if(flag) {
                    end = mid-1;
                    }
                else{
                    start = mid+1;
                    }
            }
            else if(nums[mid] < target) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return index;
}
}