class Solution {
    public int minOperations(String s) {
        int startas0 = 0;
        int startas1 = 0;
        for(int i = 0; i < s.length(); i++) {
            if(i % 2 == 0) {
                if(s.charAt(i) == '0') {
                    startas1++;
                }
                else {
                    startas0++;
                }
            }
            else {
                if(s.charAt(i) == '1') {
                    startas1++;
                }
                else {
                    startas0++;
                }
            }
        }
        return Math.min(startas0, startas1);
    }
}