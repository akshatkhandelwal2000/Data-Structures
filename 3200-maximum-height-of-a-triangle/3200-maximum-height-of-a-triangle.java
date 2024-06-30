class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        // TC : O(N) // SC : O(1)
        int i = 1;
        int ans = 0;
        int r = red;
        int b = blue;
        while(i <= red) {
            red-=i;
            i++;
            ans++;
            if(blue >= i) {
                blue-=i;
                i++;
                ans++;
            }
            else break;
        }
        int j = 1;
        int ans2 = 0;
        while(j <= b) {
            b-=j;
            j++;
            ans2++;
            if(r >= j) {
                r-=j;
                j++;
                ans2++;
            }
            else break;
        }
        return Math.max(ans, ans2);
    }
}