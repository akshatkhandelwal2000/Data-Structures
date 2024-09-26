class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        // TC : O(1) // SC : O(1)
        if(event2[0].charAt(0) > event1[1].charAt(0) &&
        event2[0].charAt(1) > event1[1].charAt(1)) return false;
        return true;
    }
}