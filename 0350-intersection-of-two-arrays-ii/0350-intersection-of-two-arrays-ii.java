class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // TC : O(NlogN) // SC : O(N)
        int n = nums1.length;
        int m = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < n && j < m) {
            if(nums1[i] < nums2[j]) {
                i++;
            }
            else if(nums2[j] < nums1[i]) {
                j++;
            }
            else {
                while(i < n && j < m && nums1[i] == nums2[j]) {
                    list.add(nums1[i]);
                    i++;
                    j++;
                }
            }
        } 
        int in = 0;
        int[] ans = new int[list.size()];
        for(int num : list) {
            ans[in++] = num;
        }
        return ans;
    }
}