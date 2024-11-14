class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int ans = 0;
        int lo = 1;
        int hi = 100000;
        while(lo <= hi) {
            int mid = lo+(hi-lo)/2;
            if(check(quantities, mid, n)) {
                ans = mid;
                hi = mid-1;
            }
            else {
                lo = mid+1;
            }
        }
        return ans;
    }
    public boolean check(int[] quantities, int mid, int n) {
        for(int i = 0; i < quantities.length; i++) {
            n = n-(quantities[i]/mid);
            if(quantities[i]%mid != 0) {
                n--;
            }
            if(n < 0) {
                return false;
            }
        }
        return true;
    }
}