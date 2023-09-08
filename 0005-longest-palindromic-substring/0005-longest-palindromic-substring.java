class Solution {
    public String longestPalindrome(String s) {
        // TC : O(N^2) // SC : O(1)
    //     int start = 0, end = 0;
    //     for(int i = 0; i < s.length(); i++) {
    //         int odd = expand(s, i, i);
    //         int even = expand(s, i, i+1);
    //         int len = Math.max(odd, even);
    //         if(len > end - start) {
    //             start = i-(len-1)/2;
    //             end = i+len/2;
    //         }
    //     }
    //     return s.substring(start, end+1);
    // }
    // private int expand(String s, int left, int right) {
    //     while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
    //         left--;
    //         right++;
    //     }
    //     return right-left-1;
        // TC : O(N^3) // SC : O(1)
        for(int length = s.length(); length > 0; length--) {
        for(int start = 0; start <= s.length()-length; start++) {
            if(check(start, start+length, s)) return s.substring(start, start+length);
        } 
    }
    return "";
    }
    boolean check(int i, int j, String s) {
        int left = i;
        int right = j-1;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    } 
}