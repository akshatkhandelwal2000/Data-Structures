class Solution {
    public boolean areNumbersAscending(String s) {
        // TC : O(N) // SC : O(1)
        int n = s.length();
        int min = 0;
        for(int i = 0; i < n; i++) {
            int num = 0;
            if(s.charAt(i)-'0' >= 0 && s.charAt(i)-'0' <= 9) {
                num = num*10+Integer.valueOf(s.charAt(i));
                i++;
                while(i < n && s.charAt(i)-'0' >= 0 && s.charAt(i)-'0' <= 9)
                {
                    num = num*10+Integer.valueOf(s.charAt(i));
                    i++;
                }
            }
            if(num != 0 && num <= min) return false;
            else if(num != 0) min = num;
        }
        return true;
    }
}