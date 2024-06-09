class Solution {
    public int numberOfChild(int n, int k) {
        // TC : O(K) // SC : O(1)
        boolean flag = true;
        int i = 0;
        int temp = 0;
        while(temp != k) {
            if(i == 0) {
                flag = true;
            }
            if(i == n-1) {
                flag = false;
            }
            if(flag) {
                i++;
            }
            if(!flag) {
                i--;
            }
            temp++;
        }
        return i;
    }
}