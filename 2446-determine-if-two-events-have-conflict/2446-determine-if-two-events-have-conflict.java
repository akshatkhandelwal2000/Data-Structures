class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        // TC : O(1) // SC : O(1)
        return event2[0].compareTo(event1[1]) <= 0 &&
        event1[0].compareTo(event2[1]) <= 0;
    }
}