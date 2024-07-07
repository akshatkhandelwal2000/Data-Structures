class Solution {
    public String getEncryptedString(String s, int k) {
        // TC : O(N) // SC : O(1)
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(s.charAt((i+k)%n));
        }
        return sb.toString();
    }
}