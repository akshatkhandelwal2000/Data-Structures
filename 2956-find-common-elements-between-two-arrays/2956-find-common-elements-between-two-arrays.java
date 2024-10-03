class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int[] score = new int[2];
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            set.add(nums2[i]);
        }
        for(int i = 0; i < nums1.length; i++) {
            if(set.contains(nums1[i])) {
                score[0]++;
            }
        }
        set = new HashSet<>();
        for(int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for(int i = 0; i < n; i++) {
            if(set.contains(nums2[i])) {
                score[1]++;
            }
        }
        return score;
    }
}