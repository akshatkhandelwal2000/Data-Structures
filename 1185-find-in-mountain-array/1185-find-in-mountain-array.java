/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        // TC : O(logN) // SC : O(1)
        int length = mountainArr.length();
        int peakIndex = findPeak(mountainArr, length);
        int ans = findTarget(mountainArr, 0, peakIndex, target, true);
        if(ans != -1) {
            return ans;
        }
        return findTarget(mountainArr, peakIndex+1, length-1, target, false);
    }
    public int findTarget(MountainArray mountainArr, int left, int right, int target, boolean isUpside) {
        while(left <= right) {
            int mid = left + (right - left) / 2;
            int midVal = mountainArr.get(mid);
            if(midVal == target) {
                return mid;
            }
            if(isUpside) {
                if(midVal < target) {
                    left = mid+1;
                }
                else {
                    right = mid-1;
                }
            }
            else {
                if(midVal < target) {
                    right = mid-1;
                }
                else {
                    left = mid+1;
                }
            }
        }
        return -1;
    }
    public int findPeak(MountainArray mountainArr, int length) {
        int left = 0;
        int right = length-1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(mountainArr.get(mid) < mountainArr.get(mid+1)) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return left;
    }
}