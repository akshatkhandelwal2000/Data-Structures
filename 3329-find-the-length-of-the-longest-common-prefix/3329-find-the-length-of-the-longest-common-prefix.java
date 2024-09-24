class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        // TC : O(NlogM) // SC : O(NlogM)
        int n = arr2.length;
        Set<Integer> set = new HashSet<>();
        for(int num : arr1) {
            String s = String.valueOf(num);
            int ele = 0;
            for(int j = 0; j < s.length(); j++) {
                ele = ele*10+(s.charAt(j)-48);
                set.add(ele);
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int val = arr2[i];
            String s = String.valueOf(val);
            int max = 0;
            int num = 0;
            for(int j = 0; j < s.length(); j++) {
                num = num*10+(s.charAt(j)-48);
                if(set.contains(num)) {
                    max++;
                }
                else break;
            }
            ans = Math.max(ans, max);
        }
        return ans;
    }
}