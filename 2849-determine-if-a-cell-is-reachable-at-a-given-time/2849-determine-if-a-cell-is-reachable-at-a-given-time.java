class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if(sx == fx && sy == fy && t == 1) return false;
        int ans = Math.max(Math.abs(sx-fx), Math.abs(sy-fy));
        if(ans <= t) return true;
        return false;
    }
}