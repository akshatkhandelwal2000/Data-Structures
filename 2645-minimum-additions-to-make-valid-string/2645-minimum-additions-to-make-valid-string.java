public class Solution {
    public int addMinimum(String word) {
        // TC : O(N) // SC : O(1)
        int n = word.length();
        int ans = 0;
        int i = 0;
        while(i < n) {
            int count = 0;       
            if(word.charAt(i) == 'a') {
                count++;
                i++;
            }          
            if(i < n && word.charAt(i) == 'b') {
                count++;
                i++;
            }           
            if(i < n && word.charAt(i) == 'c') {
                count++;
                i++;
            }           
            ans += 3 - count;
        }     
        return ans;
    }
}