class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        // TC : O(NlogN) // SC : O(1)
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        return nums2[0] - nums1[0];
    }
}