class Solution {
    public int getLucky(String s, int k) {
        // TC : O(N) + O(k*Len(s1)) // SC : O(1)
        int n = s.length();
        String s1 = "";
        for(int i = 0; i < n; i++) {
            s1 += s.charAt(i)-'a'+1;
        }
        while(k-- > 0) {
            int sum = 0;
            for(int i = 0; i < s1.length(); i++) {
                sum += Integer.valueOf(s1.charAt(i)-'0');
            }
            s1 = String.valueOf(sum);
        }
        return Integer.valueOf(s1);
    }
}