class Solution {
    public boolean lemonadeChange(int[] bills) {
        // TC : O(N) // SC : O(1)
        int five  = 0, ten = 0;
        for(int bill : bills) {
            if(bill == 5) {
                five++;
            }
            else if(bill == 10) {
                ten++; five--;
            }
            else if(ten > 0 && five >= 1) {
                ten--; five--;
            }
            else {
                five -= 3;
            }
            if(five < 0) {
                return false;
            }
        }
        return true;
    }
}