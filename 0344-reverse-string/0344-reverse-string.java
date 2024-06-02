class Solution {
    public void reverseString(char[] s) {
        // TC : O(N) // SC : O(1)
        int n = s.length;
        int i = 0;
        int j = n-1;
        while(i <= j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}