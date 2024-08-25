class Solution {
    public int countPairs(int[] nums) {
        // TC : O(N^2) // SC : O(1) 
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(nums[i] == nums[j] || check(nums, nums[i], nums[j])) {
                    ans++;
                }
            }
        }
        return ans;
    }
    public boolean check(int[] nums, int num1, int num2) {
        String first = String.valueOf(num1);
        String second = String.valueOf(num2);
        while(first.length() < second.length()) first = '0' + first;
        while(second.length() < first.length()) second = '0' + second;
        int diff = 0;
        int in1 = 0;
        int in2 = 0;
        for(int i = 0; i < first.length(); i++) {
            if(first.charAt(i) != second.charAt(i)) {
                diff++;
                if(diff == 1) {
                    in1 = i;
                }
                else if(diff == 2) {
                    in2 = i;
                }
                else return false;
            }
        } 
        char[] temp1 = first.toCharArray();
        char temp = temp1[in1];
        temp1[in1] = temp1[in2];
        temp1[in2] = temp;
        String s1 = new String(temp1);
        return s1.equals(second);
    }
}