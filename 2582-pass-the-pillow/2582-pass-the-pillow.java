class Solution {
    public int passThePillow(int n, int time) {
        // TC : O(time) // SC : O(1)
        boolean flag = true;
        int i = 1;
        while(time != 0) {
            if(i == 1) {
                flag = true;
            }
            if(i == n) {
                flag = false;
            }
            if(flag == true) {
                i++;
            }
            else if(flag == false){
                i--;
            }
            time--;
        }
        return i;
    }
}