class Solution {
    public int passThePillow(int n, int time) {
        // TC : O(N) // SC : O(1)
        int temp = 0;
        boolean flag = true;
        int i = 1;
        while(temp != time) {
            if(i == 1) {
                flag = true;
            }
            if(i == n) {
                flag = false;
            }
            if(flag) i++;
            if(!flag) i--;
            temp++;
        }
        return i;
    }
}