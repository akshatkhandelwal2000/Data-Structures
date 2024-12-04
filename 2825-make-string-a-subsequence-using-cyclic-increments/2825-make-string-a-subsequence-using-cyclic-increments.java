class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        // TC : O(M+N) // SC : O(1)
        if(str2.length() > str1.length()) {
            return false;
        }
        int n = str1.length();
        int m = str2.length();
        int i = 0;
        int j = 0;
        while(i < n && j < m) {
            if(str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            }
            else {
                int a = str1.charAt(i)-97;
                a = a%25;
                if(str1.charAt(i) == 'z') {
                    a = -1;
                }
                char b = (char)(a+98);
                if(b == str2.charAt(j)) {
                    j++;
                }
                i++;
            }
        }
        if(j >= m) {
            return true;
        }
        return false;
    }
}