class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        // TC : O(1) // SC : O(1)
        return (coordinate1.charAt(0)-'a' + coordinate2.charAt(0)-'a' + coordinate1.charAt(1)-'0' + coordinate2.charAt(1)-'0')%2 == 0; 
    }
}