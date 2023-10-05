class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i < nums.length; i++) {
        //     map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        // }
        // int n = nums.length;
        // List<Integer> ans = new ArrayList<>();
        // for(int i = 0; i < n; i++) {
        //     if(map.get(nums[i]) > n/3 && !ans.contains(nums[i])) {
        //         ans.add(nums[i]);
        //     }
        // }
        // return ans;
        int ele1 = -1;
        int ele2 = -1;
        int count1 = 0;;
        int count2 = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != ele2 && count1 == 0) {
                ele1 = nums[i];
                count1++;
            }
            else if(nums[i] == ele1) {
                count1++;
            }
            else if(nums[i] != ele1 && count2 == 0) {
                ele2 = nums[i];
                count2++;
            }
            else if(nums[i] == ele2) {
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == ele1) {
                count1++;
            }
            else if(nums[i] == ele2) {
                count2++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        if(count1 > nums.length/3) ans.add(ele1);
        if(count2 > nums.length/3) ans.add(ele2);
        return ans;
    }
}