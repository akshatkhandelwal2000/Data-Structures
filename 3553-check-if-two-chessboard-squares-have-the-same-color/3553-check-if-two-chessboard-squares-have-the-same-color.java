class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        // TC : O(1) // SC : O(1)
        if((coordinate1.charAt(0)-'a')%2 != 0 && (coordinate2.charAt(0)-'a')%2 != 0 || (coordinate1.charAt(0)-'a')%2 == 0 && (coordinate2.charAt(0)-'a')%2 == 0) {
            if((coordinate1.charAt(1)-'0')%2 !=  (coordinate2.charAt(1)-'0')%2) {
                return false;
            }
        }
        else if((coordinate1.charAt(0)-'a')%2 != (coordinate2.charAt(0)-'a')%2) {
            if((coordinate1.charAt(1)-'0')%2 ==  (coordinate2.charAt(1)-'0')%2) {
                return false;
            }
        }
        return true;
    }
}